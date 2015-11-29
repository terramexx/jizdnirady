package jizdnirady.jdf;

public class JdfVersionResolver {

    public static JdfVerzeEnum resolveVersion(String line) throws JdfParserException {
        try {
            return JdfVerzeEnum.parse(line.substring(1, line.indexOf('\"', 2)));
        } catch (Exception e) {
            throw new JdfParserException("Nelze urcit verzi JDF", e);
        }
    }

}
