package jizdnirady.jdf.mapper.v1_9;

import jizdnirady.jdf.dto.JdfLinka;
import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.AbstractObjectMapper;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Function;

/**
 * <p>TODO</p>
 */
public class JdfLinkaMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfLinka linka = new JdfLinka();
            throw new NotImplementedException("Mapper neni dosud implementovan"); // TODO Implementovat mapper
        };
    }

}

