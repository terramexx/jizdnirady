package jizdnirady.jdf.mapper.v1_10;

import jizdnirady.jdf.dto.JdfCasovyKod;
import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.AbstractObjectMapper;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Function;

/**
 * <p>TODO</p>
 */
public class JdfCasovyKodMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfCasovyKod casovyKod = new JdfCasovyKod();
            throw new NotImplementedException("Mapper neni dosud implementovan"); // TODO Implementovat mapper
        };
    }

}

