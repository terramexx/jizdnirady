package jizdnirady.loader;

import jizdnirady.jdf.JdfVerzeEnum;
import jizdnirady.jdf.JdfVersionResolver;
import jizdnirady.jdf.mapper.JdfFile;
import org.apache.commons.io.IOUtils;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * <p>Program pro zpracovani archivu obsahujicim data jednotlivych linek.</p>
 * <p>Ke stazeni z <a href="ftp://ftp.cisjr.cz/JDF/JDF.zip">ftp://ftp.cisjr.cz</a></p>
 */
public class Loader {

    private LoaderOptions options;

    private Loader() {}

    public Loader(LoaderOptions options) {
        this.options = options;
    }


    public void run() {
        File[] zipFiles = options.getInputDirectory().listFiles();
        if (zipFiles != null && zipFiles.length > 0) {
            for (File zipFile: zipFiles) {
                processZipFile(zipFile);
            }
        }
    }

    private void processZipFile(File zipFile) {
        ZipInputStream zipInputStream = null;
        try {
            zipInputStream = new ZipInputStream(new FileInputStream(zipFile));

            // Nacteme si obsah souboru zipu do pameti pro pozdejsi zpracovani
            HashMap<ZipEntry, byte[]> zipContentMap = new HashMap<>();
            ZipEntry zipEntry;
            while ((zipEntry=zipInputStream.getNextEntry())!=null) {
                byte[] data = new byte[(int) zipEntry.getSize()];
                zipInputStream.read(data, 0, (int) zipEntry.getSize());
                zipContentMap.put(zipEntry, data);
            }

            // Najdeme soubor VerzeJDF.txt
            Iterator<ZipEntry> keyIterator = zipContentMap.keySet().iterator();
            JdfVerzeEnum jdfVerzeEnum = null;
            while (keyIterator.hasNext()) {
                zipEntry = keyIterator.next();
                if (JdfFile.VERZEJDF.getFilename().equalsIgnoreCase(zipEntry.getName())) {
                    jdfVerzeEnum = JdfVersionResolver.resolveVersion(new String(zipContentMap.get(zipEntry)));
                    break;
                }
            }

            // Parsovani jednotlivych souboru
            keyIterator = zipContentMap.keySet().iterator();
            while (keyIterator.hasNext()) {
                zipEntry = keyIterator.next();
            }


            // Ted muzeme zacit parsovat spravnou verzi



            // TODO: Implementovat ...

        } catch (FileNotFoundException fnfe) {
            System.err.println("ZIP soubor nenalezen.");
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            System.err.println("Chyba pri cteni ZIP souboru.");
            ioe.printStackTrace();
        } catch (Throwable throwable) {
            System.err.println("Neocekavana chyba.");
            throwable.printStackTrace();
        } finally {
            IOUtils.closeQuietly(zipInputStream);
        }
    }




    /**
     * Main metoda pro spusteni programu.
     * @param args Vstupni parametry programu.
     */
    public static void main(String[] args) {
        LoaderOptions options = new LoaderOptions();
        CmdLineParser parser = new CmdLineParser(options);

        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            System.err.println("Chybne parametry.");
            parser.printUsage(System.err);
            System.exit(1);
        }

        Loader loader = new Loader(options);
        loader.run();
    }

}
