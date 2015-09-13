package jizdnirady.jdf.dto;

public class JdfUdaje extends JdfObject {

    private Long cisloLinky;
    private Long cisloUdaje;
    private String text;
    private Long rozliseniLinky;

    public Long getCisloLinky() {
        return cisloLinky;
    }

    public void setCisloLinky(Long cisloLinky) {
        this.cisloLinky = cisloLinky;
    }

    public Long getCisloUdaje() {
        return cisloUdaje;
    }

    public void setCisloUdaje(Long cisloUdaje) {
        this.cisloUdaje = cisloUdaje;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getRozliseniLinky() {
        return rozliseniLinky;
    }

    public void setRozliseniLinky(Long rozliseniLinky) {
        this.rozliseniLinky = rozliseniLinky;
    }

    @Override
    public String toString() {
        return "JdfUdaje{" +
                "cisloLinky=" + cisloLinky +
                ", cisloUdaje=" + cisloUdaje +
                ", text='" + text + '\'' +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
