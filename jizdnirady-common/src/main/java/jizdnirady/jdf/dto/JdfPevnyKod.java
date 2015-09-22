package jizdnirady.jdf.dto;

public class JdfPevnyKod extends JdfObject {

    private String cisloPevnehoKodu;
    private String oznaceniPevnehoKodu;
    private String rezerva;

    public String getCisloPevnehoKodu() {
        return cisloPevnehoKodu;
    }

    public void setCisloPevnehoKodu(String cisloPevnehoKodu) {
        this.cisloPevnehoKodu = cisloPevnehoKodu;
    }

    public String getOznaceniPevnehoKodu() {
        return oznaceniPevnehoKodu;
    }

    public void setOznaceniPevnehoKodu(String oznaceniPevnehoKodu) {
        this.oznaceniPevnehoKodu = oznaceniPevnehoKodu;
    }

    public String getRezerva() {
        return rezerva;
    }

    public void setRezerva(String rezerva) {
        this.rezerva = rezerva;
    }

    @Override
    public String toString() {
        return "JdfPevnyKod{" +
                "cisloPevnehoKodu='" + cisloPevnehoKodu + '\'' +
                ", oznaceniPevnehoKodu='" + oznaceniPevnehoKodu + '\'' +
                ", rezerva='" + rezerva + '\'' +
                '}';
    }
}
