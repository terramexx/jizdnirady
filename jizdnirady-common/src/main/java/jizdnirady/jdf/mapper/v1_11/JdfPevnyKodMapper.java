package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfPevnyKod;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Pevnykod je číselník pevných kódů pro symboly stanovené v bodech 1a, 2 a 3 přílohy č. 2 k vyhlášce.</p>
 */
public class JdfPevnyKodMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfPevnyKod obj = new JdfPevnyKod();

            // Číslo pevného kódu: DbString(5)
            // - povinné (max. pětimístné) číslo
            obj.setCisloPevnehoKodu(data[0]);

            // Označení pevného kódu: DbString(1)
            // - povinný text, max. 1 znak
            obj.setOznaceniPevnehoKodu(data[1]);

            // Rezerva: DbString(254)
            // - nepovinný text
            obj.setRezerva(data[2]);

            return obj;
        };
    }

}

