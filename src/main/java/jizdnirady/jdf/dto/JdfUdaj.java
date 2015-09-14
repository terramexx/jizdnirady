package jizdnirady.jdf.dto;

public class JdfUdaj extends JdfObject {

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

    public void setCisloLinky(String str) {
        this.cisloLinky = parseLong(str);
    }

    public Long getCisloUdaje() {
        return cisloUdaje;
    }

    public void setCisloUdaje(Long cisloUdaje) {
        this.cisloUdaje = cisloUdaje;
    }

    public void setCisloUdaje(String str) {
        this.cisloUdaje = parseLong(str);
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

    public void setRozliseniLinky(String str) {
        this.rozliseniLinky = parseLong(str);
    }

    @Override
    public String toString() {
        return "JdfUdaj{" +
                "cisloLinky=" + cisloLinky +
                ", cisloUdaje=" + cisloUdaje +
                ", text='" + text + '\'' +
                ", rozliseniLinky=" + rozliseniLinky +
                '}';
    }
}
