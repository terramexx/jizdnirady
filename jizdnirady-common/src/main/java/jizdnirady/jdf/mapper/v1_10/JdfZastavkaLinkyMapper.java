package jizdnirady.jdf.mapper.v1_10;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfZastavkaLinky;
import jizdnirady.jdf.mapper.AbstractObjectMapper;
import org.apache.commons.lang3.NotImplementedException;

import java.util.function.Function;

/**
 * <p>TODO</p>
 */
public class JdfZastavkaLinkyMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfZastavkaLinky obj = new JdfZastavkaLinky();
            throw new NotImplementedException("Mapper neni dosud implementovan"); // TODO Implementovat mapper
        };
    }
}

