package jizdnirady.jdf.dto;

public class JdfDopravce extends JdfObject {

    private String ic;
    private String dic;
    private String obchodniJmeno;
    private Long druhFirmy;
    private String jmenoFyzickeOsoby;
    private String adresaSidla;
    private String telefonSidlo;
    private String telefonDispecink;
    private String telefonInformace;
    private String fax;
    private String email;
    private String www;
    private Long rozliseniDopravce;

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getDic() {
        return dic;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public String getObchodniJmeno() {
        return obchodniJmeno;
    }

    public void setObchodniJmeno(String obchodniJmeno) {
        this.obchodniJmeno = obchodniJmeno;
    }

    public Long getDruhFirmy() {
        return druhFirmy;
    }

    public void setDruhFirmy(Long druhFirmy) {
        this.druhFirmy = druhFirmy;
    }

    public void setDruhFirmy(String str) {
        this.druhFirmy = parseLong(str);
    }


    public String getJmenoFyzickeOsoby() {
        return jmenoFyzickeOsoby;
    }

    public void setJmenoFyzickeOsoby(String jmenoFyzickeOsoby) {
        this.jmenoFyzickeOsoby = jmenoFyzickeOsoby;
    }

    public String getAdresaSidla() {
        return adresaSidla;
    }

    public void setAdresaSidla(String adresaSidla) {
        this.adresaSidla = adresaSidla;
    }

    public String getTelefonSidlo() {
        return telefonSidlo;
    }

    public void setTelefonSidlo(String telefonSidlo) {
        this.telefonSidlo = telefonSidlo;
    }

    public String getTelefonDispecink() {
        return telefonDispecink;
    }

    public void setTelefonDispecink(String telefonDispecink) {
        this.telefonDispecink = telefonDispecink;
    }

    public String getTelefonInformace() {
        return telefonInformace;
    }

    public void setTelefonInformace(String telefonInformace) {
        this.telefonInformace = telefonInformace;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWww() {
        return www;
    }

    public void setWww(String www) {
        this.www = www;
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

    @Override
    public String toString() {
        return "JdfDopravce{" +
                "ic='" + ic + '\'' +
                ", dic='" + dic + '\'' +
                ", obchodniJmeno='" + obchodniJmeno + '\'' +
                ", druhFirmy=" + druhFirmy +
                ", jmenoFyzickeOsoby='" + jmenoFyzickeOsoby + '\'' +
                ", adresaSidla='" + adresaSidla + '\'' +
                ", telefonSidlo='" + telefonSidlo + '\'' +
                ", telefonDispecink='" + telefonDispecink + '\'' +
                ", telefonInformace='" + telefonInformace + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", www='" + www + '\'' +
                ", rozliseniDopravce=" + rozliseniDopravce +
                '}';
    }
}
