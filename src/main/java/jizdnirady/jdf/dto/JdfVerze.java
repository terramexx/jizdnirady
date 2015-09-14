package jizdnirady.jdf.dto;

import java.util.Date;

public class JdfVerze extends JdfObject {

    private String cisloVerzeJdf;       // povinny
    private Long cisloDu;               // nepovinny
    private String okresKraj;           // nepovinny
    private String identifikaceDavky;   // nepovinny
    private Date datumVytvoreni;        // povinny
    private String jmeno;               // nepovinny

    public String getCisloVerzeJdf() {
        return cisloVerzeJdf;
    }

    public void setCisloVerzeJdf(String cisloVerzeJdf) {
        this.cisloVerzeJdf = cisloVerzeJdf;
    }

    public Long getCisloDu() {
        return cisloDu;
    }

    public void setCisloDu(String str) {
        this.cisloDu = parseLong(str);
    }

    public void setCisloDu(Long cisloDu) {
        this.cisloDu = cisloDu;
    }

    public String getOkresKraj() {
        return okresKraj;
    }

    public void setOkresKraj(String okresKraj) {
        this.okresKraj = okresKraj;
    }

    public String getIdentifikaceDavky() {
        return identifikaceDavky;
    }

    public void setIdentifikaceDavky(String identifikaceDavky) {
        this.identifikaceDavky = identifikaceDavky;
    }

    public Date getDatumVytvoreni() {
        return datumVytvoreni;
    }

    public void setDatumVytvoreni(Date datumVytvoreni) {
        this.datumVytvoreni = datumVytvoreni;
    }

    public void setDatumVytvoreni(String str) {
        this.datumVytvoreni = parseDate(str);
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    @Override
    public String toString() {
        return "JdfVerze{" +
                "cisloVerzeJdf='" + cisloVerzeJdf + '\'' +
                ", cisloDu=" + cisloDu +
                ", okresKraj='" + okresKraj + '\'' +
                ", identifikaceDavky='" + identifikaceDavky + '\'' +
                ", datumVytvoreni=" + datumVytvoreni +
                ", jmeno='" + jmeno + '\'' +
                '}';
    }
}
