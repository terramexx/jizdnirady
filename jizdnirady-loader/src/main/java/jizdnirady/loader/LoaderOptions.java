package jizdnirady.loader;

import org.kohsuke.args4j.Option;

import java.io.File;

/**
 * Vstupni parametry programu Loader.
 *
 * @see Loader
 */
public class LoaderOptions {

    /**
     * Vstupni adresar, ve kterem se nachazeni ZIP soubory (jeden ZIP reprezentuje jednu linku).
     */
    @Option(name = "-i", aliases = "--input-dir", usage = "Vstupni adresar se ZIP soubory (jeden ZIP obsahuje data jedne linky)", required = true)
    private File inputDirectory;

    public File getInputDirectory() {
        return inputDirectory;
    }

    public void setInputDirectory(File inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

}
