package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfZastavkaLinky;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Zaslinky obsahuje seznam zastávek všech linek předávaných v dávce. Jednoznačnost je
 * dána číslem linky, rozlišením linky a tarifním číslem zastávky, které vyjadřuje posloupnost zastávek
 * v rámci linky. Konkrétní zastávka je přiřazena ze souboru Zastavky přes číslo zastávky. Je-li
 * uveden nějaký atribut zastávky (vazba do souboru Pevnykod), chápe se jako default hodnota
 * pro všechny spoje linky.</p>
 */
public class JdfZastavkaLinkyMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfZastavkaLinky obj = new JdfZastavkaLinky();

            // Číslo linky: DbLong
            // - povinné šestimístné číslo, vazba do Linky
            obj.setCisloLinky(data[0]);

            // Číslo tarifní: DbLong
            // - povinné číslo
            obj.setCisloTarifni(data[1]);

            // Tarifní pásmo: DbString(50)
            // - nepovinný text
            obj.setTarifniPasmo(data[2]);

            // Číslo zastávky: DbLong
            // - povinné číslo
            obj.setCisloZastavky(data[3]);

            // Průměrná doba: DbString(5)
            // - nepovinný text, minuty od první zastávky linky
            obj.setPrumernaDoba(data[4]);

            // Pev. kód 1: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod1(data[5]);

            // Pev. kód 2: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod2(data[6]);

            // Pev. kód 3: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod3(data[7]);

            // Rozlišení linky: DbLong
            // - povinné číslo, vazba do Linky
            obj.setRozliseniLinky(data[8]);

            return obj;
        };
    }
}

