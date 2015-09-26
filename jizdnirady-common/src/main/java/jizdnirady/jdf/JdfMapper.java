package jizdnirady.jdf;

import jizdnirady.jdf.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class JdfMapper {

    private static final Logger log = LoggerFactory.getLogger(JdfMapper.class);

    /**
     * Mapuje CSV data na objekt typu JdfZastavka.
     */
    public static Function<String[], JdfZastavka> MAPPER_ZASTAVKA = data -> {
        try {
            JdfZastavka zastavka = new JdfZastavka();
            zastavka.setCisloZastavky(data[0]);
            zastavka.setNazevObce(data[1]);
            zastavka.setCastObce(data[2]);
            zastavka.setBlizsiMisto(data[3]);
            zastavka.setBlizkaObec(data[4]);
            zastavka.setStat(data[5]);
            zastavka.setPevnyKod1(data[6]);
            zastavka.setPevnyKod2(data[7]);
            zastavka.setPevnyKod3(data[8]);
            zastavka.setPevnyKod4(data[9]);
            zastavka.setPevnyKod5(data[10]);
            zastavka.setPevnyKod6(data[11]);
            return zastavka;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfZastavka.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfUdaj.
     */
    public static Function<String[], JdfUdaj> MAPPER_UDAJ = data -> {
        try {
            JdfUdaj udaje = new JdfUdaj();
            udaje.setCisloLinky(data[0]);
            udaje.setCisloUdaje(data[1]);
            udaje.setText(data[2]);
            udaje.setRozliseniLinky(data[3]);
            return udaje;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfUdaj.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfVerze.
     */
    public static Function<String[], JdfVerze> MAPPER_VERZE = data -> {
        try {
            JdfVerze verze = new JdfVerze();
            verze.setCisloVerzeJdf(data[0]);
            verze.setCisloDu(data[1]);
            verze.setOkresKraj(data[2]);
            verze.setIdentifikaceDavky(data[3]);
            verze.setDatumVytvoreni(data[4]);
            verze.setJmeno(data[5]);
            return verze;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfVerze.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfPevnyKod.
     */
    public static Function<String[], JdfPevnyKod> MAPPER_PEVNY_KOD = data -> {
        try {
            JdfPevnyKod pevnyKod = new JdfPevnyKod();
            pevnyKod.setCisloPevnehoKodu(data[0]);
            pevnyKod.setOznaceniPevnehoKodu(data[1]);
            pevnyKod.setRezerva(data[2]);
            return pevnyKod;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfPevnyKod.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfDopravce.
     */
    public static Function<String[], JdfDopravce> MAPPER_DOPRAVCE = data -> {
        try {
            JdfDopravce dopravce = new JdfDopravce();
            dopravce.setIc(data[0]);
            dopravce.setDic(data[1]);
            dopravce.setObchodniJmeno(data[2]);
            dopravce.setDruhFirmy(data[3]);
            dopravce.setJmenoFyzickeOsoby(data[4]);
            dopravce.setAdresaSidla(data[5]);
            dopravce.setTelefonSidlo(data[6]);
            dopravce.setTelefonDispecink(data[7]);
            dopravce.setTelefonInformace(data[8]);
            dopravce.setFax(data[9]);
            dopravce.setEmail(data[10]);
            dopravce.setWww(data[11]);
            dopravce.setRozliseniDopravce(data[12]);
            return dopravce;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfDopravce.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfLinka.
     */
    public static Function<String[], JdfLinka> MAPPER_LINKA = data -> {
        try {
            JdfLinka linka = new JdfLinka();
            linka.setCisloLinky(data[0]);
            linka.setNazevLinky(data[1]);
            linka.setIcDopravce(data[2]);
            linka.setTypLinky(data[3]);
            linka.setDopravniProstredek(data[4]);
            linka.setVylukovyJR(data[5]);
            linka.setSeskupeniSpoju(data[6]);
            linka.setPouzitiOznacniku(data[7]);
            linka.setJednosmernyJR(data[8]);
            linka.setRezerva(data[9]);
            linka.setCisloLicence(data[10]);
            linka.setPlatnostLicenceOd(data[11]);
            linka.setPlatnostLicenceDo(data[12]);
            linka.setPlatnostJROd(data[13]);
            linka.setPlatnostJRDo(data[14]);
            linka.setRozliseniDopravce(data[15]);
            linka.setRozliseniLinky(data[16]);
            return linka;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfLinka.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfSpoj.
     */
    public static Function<String[], JdfSpoj> MAPPER_SPOJ = data -> {
        try {
            JdfSpoj spoj = new JdfSpoj();
            spoj.setCisloLinky(data[0]);
            spoj.setCisloSpoje(data[1]);
            spoj.setPevnyKod1(data[2]);
            spoj.setPevnyKod2(data[3]);
            spoj.setPevnyKod3(data[4]);
            spoj.setPevnyKod4(data[5]);
            spoj.setPevnyKod5(data[6]);
            spoj.setPevnyKod6(data[7]);
            spoj.setPevnyKod7(data[8]);
            spoj.setPevnyKod8(data[9]);
            spoj.setPevnyKod9(data[10]);
            spoj.setPevnyKod10(data[11]);
            spoj.setKodSkupinySpoju(data[12]);
            spoj.setRozliseniLinky(data[13]);
            return spoj;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfSpoj.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfZastavkaLinky.
     */
    public static Function<String[], JdfZastavkaLinky> MAPPER_ZASTAVKA_LINKY = data -> {
        try {
            JdfZastavkaLinky zastavkaLinky = new JdfZastavkaLinky();
            zastavkaLinky.setCisloLinky(data[0]);
            zastavkaLinky.setCisloTarifni(data[1]);
            zastavkaLinky.setTarifniPasmo(data[2]);
            zastavkaLinky.setCisloZastavky(data[3]);
            zastavkaLinky.setPrumernaDoba(data[4]);
            zastavkaLinky.setPevnyKod1(data[5]);
            zastavkaLinky.setPevnyKod2(data[6]);
            zastavkaLinky.setPevnyKod3(data[7]);
            zastavkaLinky.setRozliseniLinky(data[8]);
            return zastavkaLinky;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfZastavkaLinky.class);
        }
    };


    /**
     * Mapuje CSV data na objekt JdfZastavkaSpoj.
     */
    public static Function<String[], JdfZastavkaSpoj> MAPPER_ZASTAVKA_SPOJ = data -> {
        try {
            JdfZastavkaSpoj zastavkaSpoj = new JdfZastavkaSpoj();
            zastavkaSpoj.setCisloLinky(data[0]);
            zastavkaSpoj.setCisloSpoje(data[1]);
            zastavkaSpoj.setCisloTarifni(data[2]);
            zastavkaSpoj.setCisloZastavky(data[3]);
            zastavkaSpoj.setKodOznacniku(data[4]);
            zastavkaSpoj.setCisloStanoviste(data[5]);
            zastavkaSpoj.setPevnyKod1(data[6]);
            zastavkaSpoj.setPevnyKod2(data[7]);
            zastavkaSpoj.setPevnyKod3(data[8]);
            zastavkaSpoj.setKilometry(data[9]);
            zastavkaSpoj.setCasPrijezdu(data[10]);
            zastavkaSpoj.setCasOdjezdu(data[11]);
            zastavkaSpoj.setCasPrijezduMin(data[12]);
            zastavkaSpoj.setCasOdjezduMax(data[13]);
            zastavkaSpoj.setRozliseniLinky(data[14]);
            return zastavkaSpoj;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfZastavkaSpoj.class);
        }
    };

    /**
     * Mapuje CSV data na objekt JdfZastavkaSpoj.
     */
    public static Function<String[], JdfCasovyKod> MAPPER_CASOVY_KOD = data -> {
        try {
            JdfCasovyKod casovyKod = new JdfCasovyKod();
            casovyKod.setCisloLinky(data[0]);
            casovyKod.setCisloSpoje(data[1]);
            casovyKod.setCisloCasovehoKodu(data[2]);
            casovyKod.setOznaceniCasovehoKodu(data[3]);
            casovyKod.setTypCasovehoKodu(data[4]);
            casovyKod.setDatumOd(data[5]);
            casovyKod.setDatumDo(data[6]);
            casovyKod.setPoznamka(data[7]);
            casovyKod.setRozliseniLinky(data[8]);
            return casovyKod;
        } catch (Exception e) {
            throw new JdfMapperException(e, JdfCasovyKod.class);
        }
    };

}
