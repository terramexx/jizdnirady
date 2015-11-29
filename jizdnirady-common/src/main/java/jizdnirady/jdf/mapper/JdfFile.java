package jizdnirady.jdf.mapper;

public enum JdfFile {

    VERZEJDF("verzejdf.txt"),
    CASKODY("caskody.txt"),
    DOPRAVCI("dopravci.txt"),
    LINKY("linky.txt"),
    PEVNYKOD("pevnykod.txt"),
    SPOJE("spoje.txt"),
    UDAJE("udaje.txt"),
    ZASLINKY("zaslinky.txt"),
    ZASSPOJE("zasspoje.txt"),
    ZASTAVKY("zastavky.txt");

    private String filename = null;

    JdfFile(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

}
