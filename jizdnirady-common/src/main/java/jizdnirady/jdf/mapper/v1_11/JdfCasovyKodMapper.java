package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfCasovyKod;
import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Caskody je určen k předávání údajů o časovém rozsahu provozu jednotlivých spojů
 * v konkrétních datově určených dnech nebo v určitých intervalech dnů v bodu 1b přílohy č. 2
 * k vyhlášce a o značkách v bodech 2 a 3 přílohy č. 2 k vyhlášce.</p>
 */
public class JdfCasovyKodMapper extends AbstractObjectMapper {

    // TODO Definovat vlastni funkcni rozhrani, ktere deklaruje vyjimku. Viz. http://stackoverflow.com/questions/18198176/java-8-lambda-function-that-throws-exception
    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfCasovyKod obj = new JdfCasovyKod();

            // Číslo linky: DbLong)
            // - povinné šestimístné číslo, vazba do Linky
            obj.setCisloLinky(data[0]);

            // Číslo spoje: DbLong
            // - povinné číslo
            obj.setCisloSpoje(data[1]);

            // Číslo časového kódu: DbLong
            // - povinné číslo (rozlišení časového kódu)
            obj.setCisloCasovehoKodu(data[2]);

            // Označení časového kódu: DbString(2)
            // - povinný text, max. 2 znaky
            obj.setOznaceniCasovehoKodu(data[3]);

            // Typ časové kódu: DbString[1])
            // - musí být prvkem {1,2,3,4,5,6,7,8} nebo nevyplněn
            obj.setTypCasovehoKodu(data[4]);

            // Datum od: DbDate
            // - nepovinné datum DDMMRRRR (pro omezení na jeden den stačí vyplnit jen Datum od)
            obj.setDatumOd(data[5]);

            // Datum do: DbDate
            // - nepovinné datum DDMMRRRR
            obj.setDatumDo(data[6]);

            // Poznámka: DbString(254)
            // - nepovinný text
            obj.setPoznamka(data[7]);

            // Rozlišení linky: DbLong
            // - povinné číslo, vazba do Linky
            obj.setRozliseniLinky(data[8]);

            return obj;
        };
    }

}

