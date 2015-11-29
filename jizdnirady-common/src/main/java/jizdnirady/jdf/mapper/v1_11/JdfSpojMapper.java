package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfSpoj;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Spoje obsahuje pro každý spoj jeden záznam. Definuje číslo spoje, vazbu na linku, časový
 * rozsah provozu spoje a značky ke spoji podle přílohy č. 2 k vyhlášce.</p>
 * <p>Ke spoji, který je zcela či zčásti na objednání či podmínečně provozovaný, je nutné uvést způsob
 * objednání či podmínky provozu formou příslušné poznámky v souboru Caskody.</p>
 */
public class JdfSpojMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfSpoj obj = new JdfSpoj();

            // Číslo linky: DbLong
            // - povinné šestimístné číslo, vazba do Linky
            obj.setCisloLinky(data[0]);

            // Číslo spoje: DbLong
            // - povinné číslo; liché číslo u spojů vedených ve směru vedení linky
            // - sudé číslo u spojů vedených ve směru zpět
            obj.setCisloSpoje(data[1]);

            // Pev. kód 1: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod1(data[2]);

            // Pev. kód 2: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod2(data[3]);

            // Pev. kód 3: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod3(data[4]);

            // Pev. kód 4: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod4(data[5]);

            // Pev. kód 5: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod5(data[6]);

            // Pev. kód 6: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod6(data[7]);

            // Pev. kód 7: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod7(data[8]);

            // Pev. kód 8: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod8(data[9]);

            // Pev. kód 9: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod9(data[10]);

            // Pev. kód 10: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod10(data[11]);

            // Kód skupiny spojů: DbLong
            // - povinné číslo v případě, že je nastaven příznak Seskupení spojů v záznamu linky v souboru Linky
            // - vazba do souboru SpojSkup
            obj.setKodSkupinySpoju(data[12]);

            // Rozlišení linky: DbLong
            // - povinné číslo, vazba do Linky
            obj.setRozliseniLinky(data[13]);

            return obj;
        };
    }

}

