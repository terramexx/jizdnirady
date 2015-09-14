package jizdnirady.jdf.dto;

import java.util.Date;

public class JdfCasovyKod extends JdfObject {

    private Long cisloLinky;
    private Long cisloSpoje;
    private Long cisloCasovehoKodu;
    private String oznaceniCasovehoKodu;
    private String typCasovehoKodu;
    private Date datumOd;
    private Date datumDo;
    private String poznamka;
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

    public Long getCisloCasovehoKodu() {
        return cisloCasovehoKodu;
    }

    public void setCisloCasovehoKodu(Long cisloCasovehoKodu) {
        this.cisloCasovehoKodu = cisloCasovehoKodu;
    }

    public void setCisloCasovehoKodu(String str) {
        this.cisloCasovehoKodu = parseLong(str);
    }

    public String getOznaceniCasovehoKodu() {
        return oznaceniCasovehoKodu;
    }

    public void setOznaceniCasovehoKodu(String oznaceniCasovehoKodu) {
        this.oznaceniCasovehoKodu = oznaceniCasovehoKodu;
    }

    public String getTypCasovehoKodu() {
        return typCasovehoKodu;
    }

    public void setTypCasovehoKodu(String typCasovehoKodu) {
        this.typCasovehoKodu = typCasovehoKodu;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public void setDatumOd(String str) {
        this.datumOd = parseDate(str);
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
    }

    public void setDatumDo(String str) {
        this.datumDo = parseDate(str);
    }

    public String getPoznamka() {
        return poznamka;
    }

    public void setPoznamka(String poznamka) {
        this.poznamka = poznamka;
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
        return "JdfCasovyKod{" +
                "cisloLinky=" + cisloLinky +
                ", cisloSpoje=" + cisloSpoje +
                ", cisloCasovehoKodu=" + cisloCasovehoKodu +
                ", oznaceniCasovehoKodu='" + oznaceniCasovehoKodu + '\'' +
                ", typCasovehoKodu='" + typCasovehoKodu + '\'' +
                ", datumOd=" + datumOd +
                ", datumDo=" + datumDo +
                ", poznamka='" + poznamka + '\'' +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
