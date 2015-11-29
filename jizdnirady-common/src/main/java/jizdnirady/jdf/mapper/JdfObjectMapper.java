package jizdnirady.jdf.mapper;

import jizdnirady.jdf.JdfParserException;
import jizdnirady.jdf.dto.JdfObject;

public interface JdfObjectMapper {

    JdfObject map(String[] data) throws JdfParserException;

}
