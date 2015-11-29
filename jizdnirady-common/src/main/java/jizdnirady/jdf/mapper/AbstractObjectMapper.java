package jizdnirady.jdf.mapper;

import jizdnirady.jdf.JdfParserException;
import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.JdfObjectMapper;

import java.util.function.Function;

public abstract class AbstractObjectMapper implements JdfObjectMapper {

    protected abstract Function<String[], JdfObject> getMappingFunction();

    @Override
    public JdfObject map(String[] data) throws JdfParserException {
        JdfObject jdfObject;
        try {
            jdfObject = getMappingFunction().apply(data);
        } catch (Exception e) {
            throw new JdfParserException(e);
        }
        return jdfObject;
    }

}
