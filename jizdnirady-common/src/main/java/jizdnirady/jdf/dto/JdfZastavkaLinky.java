package jizdnirady.jdf.dto;

public class JdfZastavkaLinky extends JdfObject {

    private Long cisloLinky;
    private Long cisloTarifni;
    private String tarifniPasmo;
    private Long cisloZastavky;
    private String prumernaDoba;
    private String pevnyKod1;
    private String pevnyKod2;
    private String pevnyKod3;
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

    public Long getCisloTarifni() {
        return cisloTarifni;
    }

    public void setCisloTarifni(Long cisloTarifni) {
        this.cisloTarifni = cisloTarifni;
    }

    public void setCisloTarifni(String str) {
        this.cisloTarifni = parseLong(str);
    }

    public String getTarifniPasmo() {
        return tarifniPasmo;
    }

    public void setTarifniPasmo(String tarifniPasmo) {
        this.tarifniPasmo = tarifniPasmo;
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

    public String getPrumernaDoba() {
        return prumernaDoba;
    }

    public void setPrumernaDoba(String prumernaDoba) {
        this.prumernaDoba = prumernaDoba;
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
        return "JdfZastavkaLinky{" +
                "cisloLinky=" + cisloLinky +
                ", cisloTarifni=" + cisloTarifni +
                ", tarifniPasmo='" + tarifniPasmo + '\'' +
                ", cisloZastavky=" + cisloZastavky +
                ", prumernaDoba='" + prumernaDoba + '\'' +
                ", pevnyKod1='" + pevnyKod1 + '\'' +
                ", pevnyKod2='" + pevnyKod2 + '\'' +
                ", pevnyKod3='" + pevnyKod3 + '\'' +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
