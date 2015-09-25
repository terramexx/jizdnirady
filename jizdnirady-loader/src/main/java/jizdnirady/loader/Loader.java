package jizdnirady.loader;

import com.google.common.base.Preconditions;
import jizdnirady.jdf.JdfMapper;
import jizdnirady.jdf.JdfParser;
import jizdnirady.jdf.dto.JdfObject;
import org.apache.commons.io.IOUtils;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * <p>Program pro zpracovani archivu obsahujicim data jednotlivych linek.</p>
 * <p>Ke stazeni z <a href="ftp://ftp.cisjr.cz/JDF/JDF.zip">ftp://ftp.cisjr.cz</a></p>
 */
public class Loader {

    private String FILE_CHARSET = "windows-1250";

    public static final Map<String, Function> JDF_MAPPING = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    static {
        JDF_MAPPING.put("Caskody.txt", JdfMapper.MAPPER_CASOVY_KOD);
        JDF_MAPPING.put("Dopravci.txt", JdfMapper.MAPPER_DOPRAVCE);
        JDF_MAPPING.put("Linky.txt", JdfMapper.MAPPER_LINKA);
        JDF_MAPPING.put("Pevnykod.txt", JdfMapper.MAPPER_PEVNY_KOD);
        JDF_MAPPING.put("Spoje.txt", JdfMapper.MAPPER_SPOJ);
        JDF_MAPPING.put("Udaje.txt", JdfMapper.MAPPER_UDAJ);
        JDF_MAPPING.put("VerzeJDF.txt", JdfMapper.MAPPER_VERZE);
        JDF_MAPPING.put("Zaslinky.txt", JdfMapper.MAPPER_ZASTAVKA_LINKY);
        JDF_MAPPING.put("Zasspoje.txt", JdfMapper.MAPPER_ZASTAVKA_SPOJ);
        JDF_MAPPING.put("Zastavky.txt", JdfMapper.MAPPER_ZASTAVKA);
    }

    private LoaderOptions options;

    private Loader() {}

    public Loader(LoaderOptions options) {
        Preconditions.checkNotNull(options);
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
            ZipEntry zipEntry;
            while ((zipEntry=zipInputStream.getNextEntry())!=null) {
                Function mappingFunction = JDF_MAPPING.get(zipEntry.getName());
                if (mappingFunction != null) {
                    byte[] data = new byte[(int) zipEntry.getSize()];
                    zipInputStream.read(data, 0, (int) zipEntry.getSize());
                    try (StringReader reader = new StringReader(new String(data, FILE_CHARSET))) {
                        System.out.println(String.format("Nacitani souboru %s z archivu %s", zipEntry.getName(), zipFile.getName()));
                        JdfParser<? extends JdfObject> jdfParser = new JdfParser(reader, mappingFunction);
                        JdfObject jdfObject;
                        try {
                            while ((jdfObject = jdfParser.read()) != null) {
                                System.out.println("--> " + jdfObject.toString());
                                // TODO Ulozit data do databaze nebo neco s tim udelat
                            }
                        } catch (Exception e) {
                            System.err.println(String.format("Chyba pri nacitani souboru %s z archivu %s", zipEntry.getName(), zipFile.getName()));
                            e.printStackTrace();
                        }
                    }
                } else {
                    System.err.println("Neexistuje mapovani pro soubor " + zipEntry.getName());
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("ZIP soubor nenalezen.");
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            System.err.println("Chyba pri cteni ZIP souboru.");
            ioe.printStackTrace();
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

        Loader loader = new Loader();
        loader.run();
    }

}
