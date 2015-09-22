package jizdnirady.jdf.dto;

public class JdfZastavka extends JdfObject {

    private Long cisloZastavky;
    private String nazevObce;
    private String castObce;
    private String blizsiMisto;
    private String blizkaObec;
    private String stat;
    private String pevnyKod1;
    private String pevnyKod2;
    private String pevnyKod3;
    private String pevnyKod4;
    private String pevnyKod5;
    private String pevnyKod6;

    public Long getCisloZastavky() {
        return cisloZastavky;
    }

    public void setCisloZastavky(Long cisloZastavky) {
        this.cisloZastavky = cisloZastavky;
    }

    public void setCisloZastavky(String str) {
        this.cisloZastavky = parseLong(str);
    }

    public String getNazevObce() {
        return nazevObce;
    }

    public void setNazevObce(String nazevObce) {
        this.nazevObce = nazevObce;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getBlizsiMisto() {
        return blizsiMisto;
    }

    public void setBlizsiMisto(String blizsiMisto) {
        this.blizsiMisto = blizsiMisto;
    }

    public String getBlizkaObec() {
        return blizkaObec;
    }

    public void setBlizkaObec(String blizkaObec) {
        this.blizkaObec = blizkaObec;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
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

    public String getPevnyKod4() {
        return pevnyKod4;
    }

    public void setPevnyKod4(String pevnyKod4) {
        this.pevnyKod4 = pevnyKod4;
    }

    public String getPevnyKod5() {
        return pevnyKod5;
    }

    public void setPevnyKod5(String pevnyKod5) {
        this.pevnyKod5 = pevnyKod5;
    }

    public String getPevnyKod6() {
        return pevnyKod6;
    }

    public void setPevnyKod6(String pevnyKod6) {
        this.pevnyKod6 = pevnyKod6;
    }

    @Override
    public String toString() {
        return "JdfZastavka{" +
                "cisloZastavky=" + cisloZastavky +
                ", nazevObce='" + nazevObce + '\'' +
                ", castObce='" + castObce + '\'' +
                ", blizsiMisto='" + blizsiMisto + '\'' +
                ", blizkaObec='" + blizkaObec + '\'' +
                ", stat='" + stat + '\'' +
                ", pevnyKod1='" + pevnyKod1 + '\'' +
                ", pevnyKod2='" + pevnyKod2 + '\'' +
                ", pevnyKod3='" + pevnyKod3 + '\'' +
                ", pevnyKod4='" + pevnyKod4 + '\'' +
                ", pevnyKod5='" + pevnyKod5 + '\'' +
                ", pevnyKod6='" + pevnyKod6 + '\'' +
                '}';
    }
}
