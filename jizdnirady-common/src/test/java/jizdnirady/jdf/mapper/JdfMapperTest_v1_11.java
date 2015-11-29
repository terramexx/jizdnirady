package jizdnirady.jdf.mapper;

import jizdnirady.jdf.dto.*;
import jizdnirady.jdf.mapper.v1_11.*;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class JdfMapperTest_v1_11 extends BaseMapperTest {

    private static final SimpleDateFormat dateFormatter = new SimpleDateFormat("ddMMyyyy");

    @Test
    public void testCasovyKodMapper() throws Exception {
        String data = "\"820831\",\"1\",\"1\",\"61\",\"4\",\"01072015\",\"31082015\",\"blablabla\",\"1\";";
        JdfCasovyKodMapper mapper = new JdfCasovyKodMapper();
        JdfCasovyKod obj = (JdfCasovyKod)mapper.map(splitLine(data));
        Assert.assertNotNull(obj);
        Assert.assertEquals(Long.valueOf(820831L), obj.getCisloLinky());
        Assert.assertEquals(Long.valueOf(1L), obj.getCisloSpoje());
        Assert.assertEquals(Long.valueOf(1L), obj.getCisloCasovehoKodu());
        Assert.assertEquals("61", obj.getOznaceniCasovehoKodu());
        Assert.assertEquals("4", obj.getTypCasovehoKodu());
        Assert.assertTrue(compareDate("01072015", dateFormatter, obj.getDatumOd()));
        Assert.assertTrue(compareDate("31082015", dateFormatter, obj.getDatumDo()));
        Assert.assertEquals("blablabla", obj.getPoznamka());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniLinky());
    }

    @Test
    public void testDopravceMapper() throws Exception {
        JdfDopravceMapper mapper = new JdfDopravceMapper();
        JdfDopravce obj = (JdfDopravce)mapper.map(splitLine("\"45192120\",\"\",\"ČSAD Vsetín a.s.\",\"1\",\"\",\"Ohrada 791, 755 01 Vsetín, provozovna Zlín\",\"\",\"\",\"577 005 855\",\"\",\"odzl@csadvs.cz\",\"www.csadvs.cz\",\"1\";"));
        Assert.assertNotNull(obj);
        Assert.assertEquals("45192120", obj.getIc());
        Assert.assertEquals("", obj.getDic());
        Assert.assertEquals("ČSAD Vsetín a.s.", obj.getObchodniJmeno());
        Assert.assertEquals(Long.valueOf(1L), obj.getDruhFirmy());
        Assert.assertEquals("", obj.getJmenoFyzickeOsoby());
        Assert.assertEquals("Ohrada 791, 755 01 Vsetín, provozovna Zlín", obj.getAdresaSidla());
        Assert.assertEquals("", obj.getTelefonSidlo());
        Assert.assertEquals("", obj.getTelefonDispecink());
        Assert.assertEquals("577 005 855", obj.getTelefonInformace());
        Assert.assertEquals("", obj.getFax());
        Assert.assertEquals("odzl@csadvs.cz", obj.getEmail());
        Assert.assertEquals("www.csadvs.cz", obj.getWww());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniDopravce());
    }

    @Test
    public void testLinkaMapper() throws Exception {
        JdfLinkaMapper mapper = new JdfLinkaMapper();
        JdfLinka obj = (JdfLinka)mapper.map(splitLine("\"820831\",\"Zlín-Racková-Holešov\",\"45192120\",\"V\",\"A\",\"0\",\"0\",\"0\",\"0\",\"\",\"\",\"\",\"\",\"01032015\",\"12122015\",\"1\",\"1\";"));
        Assert.assertNotNull(obj);
        Assert.assertEquals(Long.valueOf(820831L), obj.getCisloLinky());
        Assert.assertEquals("Zlín-Racková-Holešov", obj.getNazevLinky());
        Assert.assertEquals("45192120", obj.getIcDopravce());
        Assert.assertEquals("V", obj.getTypLinky());
        Assert.assertEquals("A", obj.getDopravniProstredek());
        Assert.assertEquals(Boolean.FALSE, obj.getVylukovyJR());
        Assert.assertEquals(Boolean.FALSE, obj.getSeskupeniSpoju());
        Assert.assertEquals(Boolean.FALSE, obj.getPouzitiOznacniku());
        Assert.assertEquals(Boolean.FALSE, obj.getJednosmernyJR());
        Assert.assertEquals("", obj.getRezerva());
        Assert.assertEquals("", obj.getCisloLicence());
        Assert.assertTrue(compareDate("", dateFormatter, obj.getPlatnostLicenceOd()));
        Assert.assertTrue(compareDate("", dateFormatter, obj.getPlatnostLicenceDo()));
        Assert.assertTrue(compareDate("01032015", dateFormatter, obj.getPlatnostJROd()));
        Assert.assertTrue(compareDate("12122015", dateFormatter, obj.getPlatnostJRDo()));
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniDopravce());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniLinky());
    }

    @Test
    public void testPevnyKodMapper() throws Exception {
        JdfPevnyKodMapper mapper = new JdfPevnyKodMapper();
        JdfPevnyKod obj = (JdfPevnyKod)mapper.map(splitLine("\"1\",\"X\",\"\";"));
        Assert.assertEquals("1", obj.getCisloPevnehoKodu());
        Assert.assertEquals("X", obj.getOznaceniPevnehoKodu());
        Assert.assertEquals("", obj.getRezerva());
    }

    @Test
    public void testSpojMapper() throws Exception {
        JdfSpojMapper mapper = new JdfSpojMapper();
        JdfSpoj obj = (JdfSpoj)mapper.map(splitLine("\"820831\",\"9\",\"8\",\"1\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"1\";"));
        Assert.assertEquals(Long.valueOf(820831L), obj.getCisloLinky());
        Assert.assertEquals(Long.valueOf(9L), obj.getCisloSpoje());
        Assert.assertEquals("8", obj.getPevnyKod1());
        Assert.assertEquals("1", obj.getPevnyKod2());
        Assert.assertEquals("", obj.getPevnyKod3());
        Assert.assertEquals("", obj.getPevnyKod4());
        Assert.assertEquals("", obj.getPevnyKod5());
        Assert.assertEquals("", obj.getPevnyKod6());
        Assert.assertEquals("", obj.getPevnyKod7());
        Assert.assertEquals("", obj.getPevnyKod8());
        Assert.assertEquals("", obj.getPevnyKod9());
        Assert.assertEquals("", obj.getPevnyKod10());
        Assert.assertEquals(Long.valueOf(0L), obj.getKodSkupinySpoju());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniLinky());
    }

    @Test
    public void testUdajMapper() throws Exception {
        JdfUdajMapper mapper = new JdfUdajMapper();
        JdfUdaj obj = (JdfUdaj)mapper.map(splitLine("\"820831\",\"2\",\"Na lince platí slevy pro držitele průkazu ISIC.\",\"1\";"));
        Assert.assertEquals(Long.valueOf(820831L), obj.getCisloLinky());
        Assert.assertEquals(Long.valueOf(2L), obj.getCisloUdaje());
        Assert.assertEquals("Na lince platí slevy pro držitele průkazu ISIC.", obj.getText());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniLinky());
    }

    @Test
    public void testZastavkaLinkyMapper() throws Exception {
        JdfZastavkaLinkyMapper mapper = new JdfZastavkaLinkyMapper();
        JdfZastavkaLinky obj = (JdfZastavkaLinky)mapper.map(splitLine("\"820831\",\"2\",\"\",\"17\",\"\",\"21\",\"\",\"\",\"1\";"));
        Assert.assertEquals(Long.valueOf(820831L), obj.getCisloLinky());
        Assert.assertEquals(Long.valueOf(2L), obj.getCisloTarifni());
        Assert.assertEquals("", obj.getTarifniPasmo());
        Assert.assertEquals(Long.valueOf(17L), obj.getCisloZastavky());
        Assert.assertEquals("", obj.getPrumernaDoba());
        Assert.assertEquals("21", obj.getPevnyKod1());
        Assert.assertEquals("", obj.getPevnyKod2());
        Assert.assertEquals("", obj.getPevnyKod3());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniLinky());
    }

    @Test
    public void testZastavkaMapper() throws Exception {
        JdfZastavkaMapper mapper = new JdfZastavkaMapper();
        JdfZastavka obj = (JdfZastavka)mapper.map(splitLine("\"13\",\"Zlín\",\"Mladcová\",\"hřiště\",\"\",\"\",\"19\",\"\",\"\",\"\",\"\",\"\";"));
        Assert.assertEquals(Long.valueOf(13L), obj.getCisloZastavky());
        Assert.assertEquals("Zlín", obj.getNazevObce());
        Assert.assertEquals("Mladcová", obj.getCastObce());
        Assert.assertEquals("hřiště", obj.getBlizsiMisto());
        Assert.assertEquals("", obj.getBlizkaObec());
        Assert.assertEquals("", obj.getStat());
        Assert.assertEquals("19", obj.getPevnyKod1());
        Assert.assertEquals("", obj.getPevnyKod2());
        Assert.assertEquals("", obj.getPevnyKod3());
        Assert.assertEquals("", obj.getPevnyKod4());
        Assert.assertEquals("", obj.getPevnyKod5());
        Assert.assertEquals("", obj.getPevnyKod6());
    }


    @Test
    public void testZastavkaSpojMapper() throws Exception {
        JdfZastavkaSpojMapper mapper = new JdfZastavkaSpojMapper();
        JdfZastavkaSpoj obj = (JdfZastavkaSpoj)mapper.map(splitLine("\"820831\",\"2\",\"4\",\"19\",\"\",\"\",\"\",\"\",\"\",\"12\",\"|\",\"|\",\"|\",\"|\",\"1\""));
        Assert.assertEquals(Long.valueOf(820831L), obj.getCisloLinky());
        Assert.assertEquals(Long.valueOf(2L), obj.getCisloSpoje());
        Assert.assertEquals(Long.valueOf(4L), obj.getCisloTarifni());
        Assert.assertEquals(Long.valueOf(19L), obj.getCisloZastavky());
        Assert.assertEquals(Long.valueOf(0L), obj.getKodOznacniku());
        Assert.assertEquals("", obj.getCisloStanoviste());
        Assert.assertEquals("", obj.getPevnyKod1());
        Assert.assertEquals("", obj.getPevnyKod2());
        Assert.assertEquals("", obj.getPevnyKod3());
        Assert.assertEquals("|", obj.getCasPrijezdu());
        Assert.assertEquals("|", obj.getCasOdjezdu());
        Assert.assertEquals("|", obj.getCasPrijezduMin());
        Assert.assertEquals("|", obj.getCasOdjezduMax());
        Assert.assertEquals(Long.valueOf(1L), obj.getRozliseniLinky());
    }

}
