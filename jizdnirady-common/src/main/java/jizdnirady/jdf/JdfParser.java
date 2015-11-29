package jizdnirady.jdf;

import java.io.IOException;

public interface JdfParser extends AutoCloseable {

    <T> T read() throws IOException, JdfParserException;

}
