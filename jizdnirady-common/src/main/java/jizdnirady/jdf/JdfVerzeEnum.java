package jizdnirady.jdf;

public enum JdfVerzeEnum {

    JDF_1_9,
    JDF_1_10,
    JDF_1_11;

    public static JdfVerzeEnum parse(String str) {
        if ("1.9".equals(str)) {
            return JDF_1_9;
        } else if ("1.10".equals(str)) {
            return JDF_1_10;
        } else if ("1.11".equals(str)) {
            return JDF_1_11;
        } else {
            return null;
        }
    }

}
