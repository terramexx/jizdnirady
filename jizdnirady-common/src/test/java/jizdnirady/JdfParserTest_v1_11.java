package jizdnirady;

import jizdnirady.jdf.JdfParserImpl;
import jizdnirady.jdf.mapper.v1_11.*;
import jizdnirady.jdf.dto.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public class JdfParserTest_v1_11 {

    private String FILE_CHARSET = "windows-1250";

    private Reader getReader(String resourceName) throws FileNotFoundException {
        return new InputStreamReader(new FileInputStream(getClass().getResource(resourceName).getFile()), Charset.forName(FILE_CHARSET));
    }

    @Test
    public void parsujZastavky() {
        try (JdfParserImpl<JdfZastavka> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Zastavky.txt"), new JdfZastavkaMapper())) {
            JdfZastavka zastavka;
            while ((zastavka=parser.read()) != null) {
                System.out.println(zastavka);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujUdaje() {
        try (JdfParserImpl<JdfUdaj> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Udaje.txt"), new JdfUdajMapper())) {
            JdfUdaj udaje;
            while ((udaje=parser.read()) != null) {
                System.out.println(udaje);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujPevnyKod() {
        try (JdfParserImpl<JdfPevnyKod> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Pevnykod.txt"), new JdfPevnyKodMapper())) {
            JdfPevnyKod pevnyKod;
            while ((pevnyKod=parser.read()) != null) {
                System.out.println(pevnyKod);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujDopravce() {
        try (JdfParserImpl<JdfDopravce> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Dopravci.txt"), new JdfDopravceMapper())) {
            JdfDopravce dopravce;
            while ((dopravce=parser.read()) != null) {
                System.out.println(dopravce);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujLinku() {
        try (JdfParserImpl<JdfLinka> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Linky.txt"), new JdfLinkaMapper())) {
            JdfLinka linka;
            while ((linka=parser.read()) != null) {
                System.out.println(linka);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujSpoje() {
        try (JdfParserImpl<JdfSpoj> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Spoje.txt"), new JdfSpojMapper())) {
            JdfSpoj spoj;
            while ((spoj=parser.read()) != null) {
                System.out.println(spoj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujZastavkuLinky() {
        try (JdfParserImpl<JdfZastavkaLinky> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Zaslinky.txt"), new JdfZastavkaLinkyMapper())) {
            JdfZastavkaLinky zastavkaLinky;
            while ((zastavkaLinky=parser.read()) != null) {
                System.out.println(zastavkaLinky);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujZastavkaSpoj() {
        try (JdfParserImpl<JdfZastavkaSpoj> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Zasspoje.txt"), new JdfZastavkaSpojMapper())) {
            JdfZastavkaSpoj zastavkaSpoj;
            while ((zastavkaSpoj=parser.read()) != null) {
                System.out.println(zastavkaSpoj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujCasovyKod() {
        try (JdfParserImpl<JdfCasovyKod> parser = new JdfParserImpl<>(getReader("/csv_v1_11/Caskody.txt"), new JdfCasovyKodMapper())) {
            JdfCasovyKod casovyKod;
            while ((casovyKod=parser.read()) != null) {
                System.out.println(casovyKod);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

}
