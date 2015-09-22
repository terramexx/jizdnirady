package jizdnirady.jdf.dto;

public class JdfSpoj extends JdfObject {

    private Long cisloLinky;
    private Long cisloSpoje;
    private String pevnyKod1;
    private String pevnyKod2;
    private String pevnyKod3;
    private String pevnyKod4;
    private String pevnyKod5;
    private String pevnyKod6;
    private String pevnyKod7;
    private String pevnyKod8;
    private String pevnyKod9;
    private String pevnyKod10;
    private Long kodSkupinySpoju;
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

    public String getPevnyKod7() {
        return pevnyKod7;
    }

    public void setPevnyKod7(String pevnyKod7) {
        this.pevnyKod7 = pevnyKod7;
    }

    public String getPevnyKod8() {
        return pevnyKod8;
    }

    public void setPevnyKod8(String pevnyKod8) {
        this.pevnyKod8 = pevnyKod8;
    }

    public String getPevnyKod9() {
        return pevnyKod9;
    }

    public void setPevnyKod9(String pevnyKod9) {
        this.pevnyKod9 = pevnyKod9;
    }

    public String getPevnyKod10() {
        return pevnyKod10;
    }

    public void setPevnyKod10(String pevnyKod10) {
        this.pevnyKod10 = pevnyKod10;
    }

    public Long getKodSkupinySpoju() {
        return kodSkupinySpoju;
    }

    public void setKodSkupinySpoju(Long kodSkupinySpoju) {
        this.kodSkupinySpoju = kodSkupinySpoju;
    }

    public void setKodSkupinySpoju(String str) {
        this.kodSkupinySpoju = parseLong(str);
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
        return "JdfSpoj{" +
                "cisloLinky=" + cisloLinky +
                ", cisloSpoje=" + cisloSpoje +
                ", pevnyKod1='" + pevnyKod1 + '\'' +
                ", pevnyKod2='" + pevnyKod2 + '\'' +
                ", pevnyKod3='" + pevnyKod3 + '\'' +
                ", pevnyKod4='" + pevnyKod4 + '\'' +
                ", pevnyKod5='" + pevnyKod5 + '\'' +
                ", pevnyKod6='" + pevnyKod6 + '\'' +
                ", pevnyKod7='" + pevnyKod7 + '\'' +
                ", pevnyKod8='" + pevnyKod8 + '\'' +
                ", pevnyKod9='" + pevnyKod9 + '\'' +
                ", pevnyKod10='" + pevnyKod10 + '\'' +
                ", kodSkupinySpoju=" + kodSkupinySpoju +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
