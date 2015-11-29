package jizdnirady.jdf.mapper.v1_9;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfVerze;
import jizdnirady.jdf.mapper.AbstractObjectMapper;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Function;

/**
 * <p></p>
 */
public class JdfVerzeMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfVerze obj = new JdfVerze();
            throw new NotImplementedException("Mapper neni dosud implementovan"); // TODO Implementovat mapper
        };
    }
}
