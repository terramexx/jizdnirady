package jizdnirady.jdf.dto;

public class JdfZastavkaSpoj extends JdfObject {

    private Long cisloLinky;
    private Long cisloSpoje;
    private Long cisloTarifni;
    private Long cisloZastavky;
    private Long kodOznacniku;
    private String cisloStanoviste;
    private String pevnyKod1;
    private String pevnyKod2;
    private String pevnyKod3;
    private Long kilometry;
    private String casPrijezdu;
    private String casOdjezdu;
    private String casPrijezduMin;
    private String casOdjezduMax;
    private Long rozliseniLinky;

    public Long getCisloLinky() {
        return cisloLinky;
    }

    public void setCisloLinky(Long cisloLinky) {
        this.cisloLinky = cisloLinky;
    }

    public void setCisloLinky(String str) {
        this.cisloLinky = parseLong(str);
    }

    public Long getCisloSpoje() {
        return cisloSpoje;
    }

    public void setCisloSpoje(Long cisloSpoje) {
        this.cisloSpoje = cisloSpoje;
    }

    public void setCisloSpoje(String str) {
        this.cisloSpoje = parseLong(str);
    }

    public Long getCisloTarifni() {
        return cisloTarifni;
    }

    public void setCisloTarifni(Long cisloTarifni) {
        this.cisloTarifni = cisloTarifni;
    }

    public void setCisloTarifni(String str) {
        this.cisloTarifni = parseLong(str);
    }

    public Long getCisloZastavky() {
        return cisloZastavky;
    }

    public void setCisloZastavky(Long cisloZastavky) {
        this.cisloZastavky = cisloZastavky;
    }

    public void setCisloZastavky(String str) {
        this.cisloZastavky = parseLong(str);
    }

    public Long getKodOznacniku() {
        return kodOznacniku;
    }

    public void setKodOznacniku(Long kodOznacniku) {
        this.kodOznacniku = kodOznacniku;
    }

    public void setKodOznacniku(String str) {
        this.kodOznacniku = parseLong(str);
    }

    public String getCisloStanoviste() {
        return cisloStanoviste;
    }

    public void setCisloStanoviste(String cisloStanoviste) {
        this.cisloStanoviste = cisloStanoviste;
    }

    public String getPevnyKod1() {
        return pevnyKod1;
    }

    public void setPevnyKod1(String pevnyKod1) {
        this.pevnyKod1 = pevnyKod1;
    }

    public String getPevnyKod2() {
        return pevnyKod2;
    }

    public void setPevnyKod2(String pevnyKod2) {
        this.pevnyKod2 = pevnyKod2;
    }

    public String getPevnyKod3() {
        return pevnyKod3;
    }

    public void setPevnyKod3(String pevnyKod3) {
        this.pevnyKod3 = pevnyKod3;
    }

    public Long getKilometry() {
        return kilometry;
    }

    public void setKilometry(Long kilometry) {
        this.kilometry = kilometry;
    }

    public void setKilometry(String str) {
        this.kilometry = parseLong(str);
    }

    public String getCasPrijezdu() {
        return casPrijezdu;
    }

    public void setCasPrijezdu(String casPrijezdu) {
        this.casPrijezdu = casPrijezdu;
    }

    public String getCasOdjezdu() {
        return casOdjezdu;
    }

    public void setCasOdjezdu(String casOdjezdu) {
        this.casOdjezdu = casOdjezdu;
    }

    public String getCasPrijezduMin() {
        return casPrijezduMin;
    }

    public void setCasPrijezduMin(String casPrijezduMin) {
        this.casPrijezduMin = casPrijezduMin;
    }

    public String getCasOdjezduMax() {
        return casOdjezduMax;
    }

    public void setCasOdjezduMax(String casOdjezduMax) {
        this.casOdjezduMax = casOdjezduMax;
    }

    public Long getRozliseniLinky() {
        return rozliseniLinky;
    }

    public void setRozliseniLinky(Long rozliseniLinky) {
        this.rozliseniLinky = rozliseniLinky;
    }

    public void setRozliseniLinky(String str) {
        this.rozliseniLinky = parseLong(str);
    }

    @Override
    public String toString() {
        return "JdfZastavkaSpoj{" +
                "cisloLinky=" + cisloLinky +
                ", cisloSpoje=" + cisloSpoje +
                ", cisloTarifni=" + cisloTarifni +
                ", cisloZastavky=" + cisloZastavky +
                ", kodOznacniku=" + kodOznacniku +
                ", cisloStanoviste='" + cisloStanoviste + '\'' +
                ", pevnyKod1='" + pevnyKod1 + '\'' +
                ", pevnyKod2='" + pevnyKod2 + '\'' +
                ", pevnyKod3='" + pevnyKod3 + '\'' +
                ", kilometry=" + kilometry +
                ", casPrijezdu='" + casPrijezdu + '\'' +
                ", casOdjezdu='" + casOdjezdu + '\'' +
                ", casPrijezduMin='" + casPrijezduMin + '\'' +
                ", casOdjezduMax='" + casOdjezduMax + '\'' +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
