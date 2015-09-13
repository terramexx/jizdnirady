package jizdnirady.jdf;

import jizdnirady.jdf.dto.JdfObject;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.function.Function;

public class JdfParser<T extends JdfObject> implements AutoCloseable {

    private BufferedReader reader;
    private Function<String[], T> mapper;

    public JdfParser(Reader reader, Function<String[], T> mapper) {
        this.reader = new BufferedReader(reader);
        this.mapper = mapper;
    }

    @Override
    public void close() throws Exception {
        if (reader != null) {
            reader.close();
        }
    }

    private String[] readLine() throws IOException {
        String line = reader.readLine();
        if (line != null) {
            String[] data = line.replaceAll(";$","").split("\",\"");
            for (int i=0; i<data.length; i++) {
                data[i] = StringUtils.strip(data[i], "\"");
            }
            return data;
        } else {
            return null;
        }
    }

    public <T> T read() throws IOException {
        String[] data = readLine();
        if (data != null) {
            return (T) mapper.apply(data);
        } else {
            return null;
        }
    }
}
