package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfUdaj;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Udaje obsahuje textové informace k lince uvedené pod jízdním řádem linky (další údaje
 * potřebné pro informování cestujících). Pro každý řádek textu je jeden záznam, v rámci linky jsou
 * rozlišeny číslem údaje (tzn. pořadové číslo řádku). Celková délka textových informací pro jednu
 * linku je omezena na 4000 znaků, ostatní znaky jsou ignorovány.</p>
 */
public class JdfUdajMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfUdaj obj = new JdfUdaj();

            // Číslo linky: DbLong
            // - povinné šestimístné číslo, vazba do Linky
            obj.setCisloLinky(data[0]);

            // Číslo údaje: DbLong
            // - povinné číslo
            obj.setCisloUdaje(data[1]);

            // Text: DbString(254)
            // - povinný text
            obj.setText(data[2]);

            // Rozlišení linky: DbLong
            // - povinné číslo, vazba do Linky
            obj.setRozliseniLinky(data[3]);

            return obj;
        };
    }

}

