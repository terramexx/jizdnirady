package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.dto.JdfZastavka;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <b>Parsuje Zastavky</b>
 *
 * <p>Soubor Zastavky slouží jako číselník zastávek pro předávanou dávku. Vazba je realizována přes
 * číslo zastávky (ze souborů Zasspoje a Zaslinky). Celý název zastávky je pro tiskové výstupy
 * vytvořen složením ze všech tří částí oddělených čárkami, tj. <Název obce>,<Část obce>,<Bližší
 * místo> a doplněn atributy zastávky ze souboru Pevnykod (jestliže mají vztah k zastávce – tj. x,
 * MHD, WC, atd.). Pokud je u mezinárodní linky ve smyslu ustanovení § 5 odst. 3 vyhlášky uveden
 * název hraničního přechodu, který slouží pouze pro účely pasového a celního odbavení, uvede se
 * do atributů v souboru Zaslinky pevný kód "$" (CLO). Tento pevný kód se neuvádí, pokud je
 * na hraničním přechodu zastávka pro nástup a výstup cestujících. Pole Stát je povinné vždy. Pole
 * Blízká obec je povinné jen pro zastávky na území ČR a SR.</p>
 */
public class JdfZastavkaMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfZastavka obj = new JdfZastavka();

            // Číslo zastávky: DbLong
            // - povinné číslo
            obj.setCisloZastavky(data[0]);

            // Název obce: DbString(48)
            // - povinný text
            obj.setNazevObce(data[1]);

            // Část obce: DbString(48)
            // - nepovinný text
            obj.setCastObce(data[2]);

            // Bližší místo: DbString(48)
            // - nepovinný text
            obj.setBlizsiMisto(data[3]);

            // Blízká obec: DbString(3)
            // - povinná, jestliže stát je CZ nebo SK
            obj.setBlizkaObec(data[4]);

            // Stát: DbString(3)
            // - povinný
            obj.setStat(data[5]);

            // Pev. kód 1: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod1(data[6]);

            // Pev. kód 2: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod2(data[7]);

            // Pev. kód 3: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod3(data[8]);

            // Pev. kód 4: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod4(data[9]);

            // Pev. kód 5: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod5(data[10]);

            // Pev. kód 6: DbString(5)
            // - nepovinné číslo, vazba do Pevnykod
            obj.setPevnyKod6(data[11]);
            return obj;
        };
    }
}

