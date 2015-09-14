package jizdnirady;

import jizdnirady.jdf.JdfParser;
import jizdnirady.jdf.JdfMapper;
import jizdnirady.jdf.dto.*;
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
        try (JdfParser<JdfZastavka> parser = new JdfParser(getReader("/csv/Zastavky.txt"), JdfMapper.MAPPER_ZASTAVKA)) {
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
        try (JdfParser<JdfUdaj> parser = new JdfParser(getReader("/csv/Udaje.txt"), JdfMapper.MAPPER_UDAJ)) {
            JdfUdaj udaje;
            while ((udaje=parser.read()) != null) {
                System.out.println(udaje);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void parsujVerziJdf() throws Exception {
        try (JdfParser<JdfVerze> parser = new JdfParser(getReader("/csv/VerzeJDF.txt"), JdfMapper.MAPPER_VERZE)) {
            JdfVerze verze;
            while ((verze=parser.read()) != null) {
                System.out.println(verze);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujPevnyKod() throws Exception {
        try (JdfParser<JdfPevnyKod> parser = new JdfParser(getReader("/csv/Pevnykod.txt"), JdfMapper.MAPPER_PEVNY_KOD)) {
            JdfPevnyKod pevnyKod;
            while ((pevnyKod=parser.read()) != null) {
                System.out.println(pevnyKod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujDopravce() throws Exception {
        try (JdfParser<JdfDopravce> parser = new JdfParser(getReader("/csv/Dopravci.txt"), JdfMapper.MAPPER_DOPRAVCE)) {
            JdfDopravce dopravce;
            while ((dopravce=parser.read()) != null) {
                System.out.println(dopravce);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujLinku() throws Exception {
        try (JdfParser<JdfLinka> parser = new JdfParser(getReader("/csv/Linky.txt"), JdfMapper.MAPPER_LINKA)) {
            JdfLinka linka;
            while ((linka=parser.read()) != null) {
                System.out.println(linka);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujSpoje() throws Exception {
        try (JdfParser<JdfSpoj> parser = new JdfParser(getReader("/csv/Spoje.txt"), JdfMapper.MAPPER_SPOJ)) {
            JdfSpoj spoj;
            while ((spoj=parser.read()) != null) {
                System.out.println(spoj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujZastavkuLinky() throws Exception {
        try (JdfParser<JdfZastavkaLinky> parser = new JdfParser(getReader("/csv/Zaslinky.txt"), JdfMapper.MAPPER_ZASTAVKA_LINKY)) {
            JdfZastavkaLinky zastavkaLinky;
            while ((zastavkaLinky=parser.read()) != null) {
                System.out.println(zastavkaLinky);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujZastavkaSpoj() throws Exception {
        try (JdfParser<JdfZastavkaSpoj> parser = new JdfParser(getReader("/csv/Zasspoje.txt"), JdfMapper.MAPPER_ZASTAVKA_SPOJ)) {
            JdfZastavkaSpoj zastavkaSpoj;
            while ((zastavkaSpoj=parser.read()) != null) {
                System.out.println(zastavkaSpoj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void parsujCasovyKod() throws Exception {
        try (JdfParser<JdfCasovyKod> parser = new JdfParser(getReader("/csv/Caskody.txt"), JdfMapper.MAPPER_CASOVY_KOD)) {
            JdfCasovyKod casovyKod;
            while ((casovyKod=parser.read()) != null) {
                System.out.println(casovyKod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
