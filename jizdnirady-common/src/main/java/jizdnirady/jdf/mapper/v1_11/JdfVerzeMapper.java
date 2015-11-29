package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfVerze;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor nese informaci o použité verzi jednotného datového formátu a údaje identifikující datový
 * obsah. V JDF – verze 1.11 (dále jen JDF 1.11) bude povinný textový údaj Číslo verze JDF vyplněn
 * hodnotou „1.11“.</p>
 */
public class JdfVerzeMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfVerze obj = new JdfVerze();

            // Číslo verze JDF: hodnota „1.11“
            // - povinný text
            obj.setCisloVerzeJdf(data[0]);

            // Číslo DÚ: DbLong
            // - nepovinné trojmístné číslo
            obj.setCisloDu(data[1]);

            // Okres/Kraj: DbString(2)
            // - nepovinný text
            obj.setOkresKraj(data[2]);

            // Identifikace dávky: DbString(20)
            // - nepovinný text
            obj.setIdentifikaceDavky(data[3]);

            // Datum výroby dávky: DbDate
            // - povinné datum (DDMMRRRR)
            obj.setDatumVytvoreni(data[4]);

            // Jméno: DbString(60)
            // - nepovinný text
            obj.setJmeno(data[5]);

            return obj;
        };
    }

}
