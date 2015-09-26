package jizdnirady.jdf;

import com.google.common.base.Preconditions;
import jizdnirady.jdf.dto.JdfObject;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.function.Function;

public class JdfParserImpl<T extends JdfObject> implements JdfParser {

    private BufferedReader reader;
    private Function<String[], T> mapper;

    public JdfParserImpl(Reader reader, Function<String[], T> mapper) {
        Preconditions.checkNotNull(reader, "Reader je null");
        Preconditions.checkNotNull(mapper, "Mapper je null");
        this.reader = new BufferedReader(reader);
        this.mapper = mapper;
    }

    @Override
    public void close() throws IOException {
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

    @Override
    public <T> T read() throws IOException, JdfMapperException {
        String[] data = readLine();
        if (data != null) {
            return (T) mapper.apply(data);
        } else {
            return null;
        }
    }
}
