package jizdnirady.jdf.dto;

import java.util.Date;

public class JdfLinka extends JdfObject {

    private Long cisloLinky;
    private String nazevLinky;
    private String icDopravce;
    private String typLinky;
    private String dopravniProstredek;
    private Boolean vylukovyJR;
    private Boolean seskupeniSpoju;
    private Boolean pouzitiOznacniku;
    private Boolean jednosmernyJR;
    private String rezerva;
    private String cisloLicence;
    private Date platnostLicenceOd;
    private Date platnostLicenceDo;
    private Date platnostJROd;
    private Date platnostJRDo;
    private Long rozliseniDopravce;
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

    public String getNazevLinky() {
        return nazevLinky;
    }

    public void setNazevLinky(String nazevLinky) {
        this.nazevLinky = nazevLinky;
    }

    public String getIcDopravce() {
        return icDopravce;
    }

    public void setIcDopravce(String icDopravce) {
        this.icDopravce = icDopravce;
    }

    public String getTypLinky() {
        return typLinky;
    }

    public void setTypLinky(String typLinky) {
        this.typLinky = typLinky;
    }

    public String getDopravniProstredek() {
        return dopravniProstredek;
    }

    public void setDopravniProstredek(String dopravniProstredek) {
        this.dopravniProstredek = dopravniProstredek;
    }

    public Boolean getVylukovyJR() {
        return vylukovyJR;
    }

    public void setVylukovyJR(Boolean vylukovyJR) {
        this.vylukovyJR = vylukovyJR;
    }

    public void setVylukovyJR(String str) {
        this.vylukovyJR = parseBoolean(str);
    }

    public Boolean getSeskupeniSpoju() {
        return seskupeniSpoju;
    }

    public void setSeskupeniSpoju(Boolean seskupeniSpoju) {
        this.seskupeniSpoju = seskupeniSpoju;
    }

    public void setSeskupeniSpoju(String str) {
        this.seskupeniSpoju = parseBoolean(str);
    }

    public Boolean getPouzitiOznacniku() {
        return pouzitiOznacniku;
    }

    public void setPouzitiOznacniku(Boolean pouzitiOznacniku) {
        this.pouzitiOznacniku = pouzitiOznacniku;
    }

    public void setPouzitiOznacniku(String str) {
        this.pouzitiOznacniku = parseBoolean(str);
    }

    public Boolean getJednosmernyJR() {
        return jednosmernyJR;
    }

    public void setJednosmernyJR(Boolean jednosmernyJR) {
        this.jednosmernyJR = jednosmernyJR;
    }

    public void setJednosmernyJR(String str) {
        this.jednosmernyJR = parseBoolean(str);
    }

    public String getRezerva() {
        return rezerva;
    }

    public void setRezerva(String rezerva) {
        this.rezerva = rezerva;
    }

    public String getCisloLicence() {
        return cisloLicence;
    }

    public void setCisloLicence(String cisloLicence) {
        this.cisloLicence = cisloLicence;
    }

    public Date getPlatnostLicenceOd() {
        return platnostLicenceOd;
    }

    public void setPlatnostLicenceOd(Date platnostLicenceOd) {
        this.platnostLicenceOd = platnostLicenceOd;
    }

    public void setPlatnostLicenceOd(String str) {
        this.platnostLicenceOd = parseDate(str);
    }

    public Date getPlatnostLicenceDo() {
        return platnostLicenceDo;
    }

    public void setPlatnostLicenceDo(Date platnostLicenceDo) {
        this.platnostLicenceDo = platnostLicenceDo;
    }

    public void setPlatnostLicenceDo(String str) {
        this.platnostLicenceDo = parseDate(str);
    }

    public Date getPlatnostJROd() {
        return platnostJROd;
    }

    public void setPlatnostJROd(Date platnostJROd) {
        this.platnostJROd = platnostJROd;
    }

    public void setPlatnostJROd(String str) {
        this.platnostJROd = parseDate(str);
    }

    public Date getPlatnostJRDo() {
        return platnostJRDo;
    }

    public void setPlatnostJRDo(Date platnostJRDo) {
        this.platnostJRDo = platnostJRDo;
    }

    public void setPlatnostJRDo(String str) {
        this.platnostJRDo = parseDate(str);
    }

    public Long getRozliseniDopravce() {
        return rozliseniDopravce;
    }

    public void setRozliseniDopravce(Long rozliseniDopravce) {
        this.rozliseniDopravce = rozliseniDopravce;
    }

    public void setRozliseniDopravce(String str) {
        this.rozliseniDopravce = parseLong(str);
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
        return "JdfLinka{" +
                "cisloLinky=" + cisloLinky +
                ", nazevLinky='" + nazevLinky + '\'' +
                ", icDopravce='" + icDopravce + '\'' +
                ", typLinky='" + typLinky + '\'' +
                ", dopravniProstredek='" + dopravniProstredek + '\'' +
                ", vylukovyJR=" + vylukovyJR +
                ", seskupeniSpoju=" + seskupeniSpoju +
                ", pouzitiOznacniku=" + pouzitiOznacniku +
                ", jednosmernyJR=" + jednosmernyJR +
                ", rezerva='" + rezerva + '\'' +
                ", cisloLicence='" + cisloLicence + '\'' +
                ", platnostLicenceOd=" + platnostLicenceOd +
                ", platnostLicenceDo=" + platnostLicenceDo +
                ", platnostJROd=" + platnostJROd +
                ", platnostJRDo=" + platnostJRDo +
                ", rozliseniDopravce=" + rozliseniDopravce +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
