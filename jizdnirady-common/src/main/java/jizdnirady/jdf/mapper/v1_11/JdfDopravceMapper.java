package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfDopravce;
import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Dopravci je číselník dopravců linek předávaných v dávce. Vazba je vytvořena přes IČ a
 * Rozlišení dopravce ze souboru Linky. Přiřazení více dopravců k jedné lince je podporováno pomocí
 * souboru Altdop. V případě potřeby přiřadit k jednotlivým linkám různé dopravce se stejným IČ je
 * nezbytné rozlišit tyto záznamy v poli Rozlišení dopravce.</p>
 */
public class JdfDopravceMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfDopravce obj = new JdfDopravce();

            // IČ: DbString(10)
            // - povinné osmimístné číslo
            obj.setIc(data[0]);

            // DIČ: DbString(14)
            // - nepovinný text
            obj.setDic(data[1]);

            // Obchodní jméno: DbString(254)
            // - povinný text
            obj.setObchodniJmeno(data[2]);

            // Druh firmy: DbLong
            // - povinné, musí být prvkem {1, 2}
            obj.setDruhFirmy(data[3]);

            // Jméno fyz.osoby: DbString(254)
            // - povinný text v případě, že druh firmy = fyz. osoba
            obj.setJmenoFyzickeOsoby(data[4]);

            // Sídlo - adresa: DbString(254)
            // - povinný text
            obj.setAdresaSidla(data[5]);

            // Telefon sídla: DbString(48)
            // - povinný text
            obj.setTelefonSidlo(data[6]);

            // Telefon dispečink: DbString(48)
            // - nepovinný text
            obj.setTelefonDispecink(data[7]);

            // Telefon informace: DbString(48)
            // - nepovinný text
            obj.setTelefonInformace(data[8]);

            // Fax: DbString(48)
            // - nepovinný text
            obj.setFax(data[9]);

            // E-mail: DbString(48)
            // - nepovinný text
            obj.setEmail(data[10]);

            // WWW: DbString(48)
            // - nepovinný text
            obj.setWww(data[11]);

            // Rozlišení dopravce: DbLong
            // - povinné číslo
            obj.setRozliseniDopravce(data[12]);

            return obj;
        };
    }
}

