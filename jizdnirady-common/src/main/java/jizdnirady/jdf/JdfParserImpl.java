package jizdnirady.jdf;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.JdfObjectMapper;
import org.apache.commons.lang3.StringUtils;

import java.io.*;

public class JdfParserImpl<T extends JdfObject> implements JdfParser {

    private BufferedReader reader;
    private JdfObjectMapper mapper;

    public JdfParserImpl(Reader reader, JdfObjectMapper mapper) {
        if (reader == null) {
            throw new NullPointerException("Reader je null");
        }
        if (mapper == null) {
            throw new NullPointerException("Mapper je null");
        }
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
        return splitCsv(line);
    }

    @Override
    public <T> T read() throws IOException, JdfParserException {
        String[] data = readLine();
        if (data != null)
            return (T) mapper.map(data);
        else
            return null;
    }

    public static String[] splitCsv(String line) {
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
}
