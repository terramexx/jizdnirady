package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfZastavkaSpoj;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <b>Parsuje Zasspoje</b>
 *
 * <p>Soubor Zasspoje obsahuje pro každý spoj a každou zastávku linky jeden záznam. Jednoznačnost
 * záznamu je určena číslem linky, rozlišením linky, číslem spoje a tarifním číslem zastávky.
 * To znamená, že zastávky spojů jsou seřazeny vždy podle zastávek linky, a proto časové a km údaje
 * jsou pro směr zpět (jsou-li záznamy pro spoj setříděny podle tarifních čísel zastávky) uvedeny
 * v opačném pořadí, tj. od cílové zastávky do výchozí. Časové a km údaje pro zastávky před výchozí
 * a za cílovou zastávkou spoje nejsou vyplněny (prázdný údaj). Každý spoj má své km údaje,
 * počínaje výchozí zastávkou spoje – povinně 0 km.</p>
 * <p>U spojů, které nejsou zcela či zčásti na objednání či podmínečně provozované, musí časové
 * údaje ve směru jízdy tvořit neklesající posloupnost začínající odjezdem z výchozí zastávky spoje a
 * končící příjezdem do cílové zastávky spoje. Pro každou zastávku spoje jsou uvedeny časy odjezdu
 * (pole Čas odjezdu) vyjma případu, kdy spoj zastávkou projíždí (čas odjezdu obsahuje znak ”|”)
 * nebo jede jiným směrem (čas odjezdu obsahuje znak ”<”). Je-li uvedeno, že spoj jede jiným
 * směrem, jsou km údaje prázdné. V případě, že spoj stojí v zastávce déle než 5 minut, musí být
 * uveden i čas příjezdu (v poli Čas příjezdu), ale může být uveden také, je-li doba kratší než 5 minut.
 * Pole Čas příjezdu min. a Čas odjezdu max. zůstávají prázdná.</p>
 * <p>U spojů, které jsou zcela či zčásti na objednání či podmínečně provozované, jsou povinná pole
 * Čas příjezdu a Čas příjezdu min. vyjma výchozí zastávky spoje. Dále jsou povinná pole Čas
 * odjezdu a Čas odjezdu max. vyjma koncové zastávky spoje. Zmíněná čtyři pole mohou obsahovat
 * znak „|“ v případě, kdy spoj zastávkou projíždí, či znak ”<” v případě, kdy spoj jede jiným směrem.
 * Km údaje se udávají pro nejdelší možnou jízdu. Je-li uvedeno, že spoj jede jiným směrem, jsou km
 * údaje prázdné.</p>
 * <p>Ke spoji, který je zcela či zčásti na objednání či podmínečně provozovaný, je nutné uvést způsob
 * objednání či podmínky provozu formou příslušné poznámky v souboru Caskody.</p>
 */
public class JdfZastavkaSpojMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfZastavkaSpoj obj = new JdfZastavkaSpoj();

            // Číslo linky: DbLong
            // - povinné šestimístné číslo, vazba do Linky
            obj.setCisloLinky(data[0]);

            // Číslo spoje: DbLong
            // - povinné číslo
            obj.setCisloSpoje(data[1]);

            // Číslo tarifní: DbLong
            // - povinné číslo
            obj.setCisloTarifni(data[2]);

            // Číslo zastávky: DbLong
            // - povinné číslo, vazba do Zastavky
            obj.setCisloZastavky(data[3]);

            // Kód označníku: DbLong
            // - povinné číslo v případě, že je nastaven příznak Použití označníků v záznamu linky v souboru Linky
            // - spolu s Číslem zastávky vazba do souboru Oznacniky
            obj.setKodOznacniku(data[4]);

            // Číslo stanoviště: DbString(48)
            // - nepovinné číslo
            obj.setCisloStanoviste(data[5]);

            // Pev. kód 1: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod1(data[6]);

            // Pev. kód 2: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod2(data[7]);

            // Pev. kód 3: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod3(data[8]);

            // Kilometry: DbLong
            // - povinné číslo v případě, že je vyplněn čas příjezdu nebo odjezdu, nebo pokud čas příjezdu nebo odjezdu obsahuje |
            obj.setKilometry(data[9]);

            // Čas příjezdu: DbString(5)
            // - povinný v koncové zastávce, číslo, <, |
            // - povinný (mimo výchozí zastávku) časový údaj příjezdu pro nejdelší možnou jízdu u spojů, které jsou zcela či zčásti na objednání či podmínečně provozované
            obj.setCasPrijezdu(data[10]);

            // Čas odjezdu: DbString(5)
            // - nepovinný v koncové zastávce, číslo, <, |
            // - časový údaj odjezdu pro nejkratší možnou jízdu u spojů, které jsou zcela či zčásti na objednání či podmínečně provozované
            obj.setCasOdjezdu(data[11]);

            // Čas příjezdu min.: DbString(5)
            // - číslo, <, |
            // - povinný údaj (mimo výchozí zastávku) jen u spojů, které jsou zcela či zčásti na objednání či podmínečně provozované
            // - časový údaj příjezdu pro nejkratší možnou jízdu
            obj.setCasPrijezduMin(data[12]);

            // Čas odjezdu max.: DbString(5)
            // - číslo, <, |
            // - povinný údaj (mimo koncovou zastávku) jen u spojů, které jsou zcela či zčásti na objednání či podmínečně provozované
            // - časový údaj odjezdu pro nejdelší možnou jízdu
            obj.setCasOdjezduMax(data[13]);

            // Rozlišení linky: DbLong
            // - povinné číslo, vazba do Linky
            obj.setRozliseniLinky(data[14]);

            return obj;
        };
    }

}

