package jizdnirady;

import jizdnirady.jdf.JdfParserImpl;
import jizdnirady.jdf.JdfMapper;
import jizdnirady.jdf.dto.*;
import org.junit.Assert;
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
    public void parsujZastavky() {
        try (JdfParserImpl<JdfZastavka> parser = new JdfParserImpl(getReader("/csv/Zastavky.txt"), JdfMapper.MAPPER_ZASTAVKA)) {
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
        try (JdfParserImpl<JdfUdaj> parser = new JdfParserImpl(getReader("/csv/Udaje.txt"), JdfMapper.MAPPER_UDAJ)) {
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
    public void parsujVerziJdf() {
        try (JdfParserImpl<JdfVerze> parser = new JdfParserImpl(getReader("/csv/VerzeJDF.txt"), JdfMapper.MAPPER_VERZE)) {
            JdfVerze verze;
            while ((verze=parser.read()) != null) {
                System.out.println(verze);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void parsujPevnyKod() {
        try (JdfParserImpl<JdfPevnyKod> parser = new JdfParserImpl(getReader("/csv/Pevnykod.txt"), JdfMapper.MAPPER_PEVNY_KOD)) {
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
        try (JdfParserImpl<JdfDopravce> parser = new JdfParserImpl(getReader("/csv/Dopravci.txt"), JdfMapper.MAPPER_DOPRAVCE)) {
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
        try (JdfParserImpl<JdfLinka> parser = new JdfParserImpl(getReader("/csv/Linky.txt"), JdfMapper.MAPPER_LINKA)) {
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
        try (JdfParserImpl<JdfSpoj> parser = new JdfParserImpl(getReader("/csv/Spoje.txt"), JdfMapper.MAPPER_SPOJ)) {
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
        try (JdfParserImpl<JdfZastavkaLinky> parser = new JdfParserImpl(getReader("/csv/Zaslinky.txt"), JdfMapper.MAPPER_ZASTAVKA_LINKY)) {
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
        try (JdfParserImpl<JdfZastavkaSpoj> parser = new JdfParserImpl(getReader("/csv/Zasspoje.txt"), JdfMapper.MAPPER_ZASTAVKA_SPOJ)) {
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
        try (JdfParserImpl<JdfCasovyKod> parser = new JdfParserImpl(getReader("/csv/Caskody.txt"), JdfMapper.MAPPER_CASOVY_KOD)) {
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
