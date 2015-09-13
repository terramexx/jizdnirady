package jizdnirady;

import jizdnirady.jdf.JdfParser;
import jizdnirady.jdf.JdfMapper;
import jizdnirady.jdf.dto.JdfUdaje;
import jizdnirady.jdf.dto.JdfZastavka;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class CvsParserTest {

    private String FILE_CHARSET = "windows-1250";

    private Reader getReader(String resourceName) throws FileNotFoundException {
        return new InputStreamReader(new FileInputStream(getClass().getResource(resourceName).getFile()), Charset.forName(FILE_CHARSET));
    }

    @Test
    public void parsujZastavky() throws Exception {
        try (JdfParser<JdfZastavka> parser = new JdfParser(getReader("/csv/Zastavky.txt"), JdfMapper.JdfMapperToZastavka)) {
            JdfZastavka zastavka;
            while ((zastavka=parser.read()) != null) {
                System.out.println(zastavka);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujUdaje() throws Exception {
        try (JdfParser<JdfUdaje> parser = new JdfParser(getReader("/csv/Udaje.txt"), JdfMapper.JdfMapperToUdaje)) {
            JdfUdaje udaje;
            while ((udaje=parser.read()) != null) {
                System.out.println(udaje);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
