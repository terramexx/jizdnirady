package jizdnirady.loader;

import org.junit.Test;

import java.io.File;

public class LoaderTest {

    private File testInputDir = new File(getClass().getResource("/zip").getFile());

    @Test
    public void runLoader() throws Exception {
        LoaderOptions options = new LoaderOptions();
        options.setInputDirectory(testInputDir);

        Loader loader = new Loader(options);
        loader.run();
    }

}
