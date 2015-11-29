package jizdnirady.jdf.mapper.v1_11;

import jizdnirady.jdf.dto.JdfLinka;
import jizdnirady.jdf.dto.JdfObject;
import jizdnirady.jdf.mapper.AbstractObjectMapper;

import java.util.function.Function;

/**
 * <p>Soubor Linky obsahuje pro každou verzi linky jeden záznam. Různé verze téže linky (jízdní řády
 * s různou platností) je třeba rozlišit v poli Rozlišení linky. Pokud je nastaven příznak Seskupení
 * spojů, pak každý spoj linky musí obsahovat vazbu do souboru SpojSkup. Pokud je nastaven příznak
 * Použití označníků, pak u každého zastavení spoje linky v souboru Zasspoje musí být vazba
 * do souboru Oznacniky.</p>
 */
public class JdfLinkaMapper extends AbstractObjectMapper {

    // TODO Validace hodnot

    @Override
    protected Function<String[], JdfObject> getMappingFunction() {
        return data -> {
            JdfLinka obj = new JdfLinka();

            // Číslo linky: DbLong
            // - povinné šestimístné číslo
            obj.setCisloLinky(data[0]);

            // Název linky: DbString(254)
            // - povinný text
            obj.setNazevLinky(data[1]);

            // IČ dopravce: DbString(10)
            // - povinné osmimístné číslo, vazba do Dopravci
            obj.setIcDopravce(data[2]);

            // Typ linky: DbString(1)
            // - povinný znak z {A, B, N, P, V, Z, D}
            obj.setTypLinky(data[3]);

            // Dopravní prostředek: DbString(1)
            // - povinný znak z {A, E, L, M, P, T}
            obj.setDopravniProstredek(data[4]);

            // Výlukový JŘ: Bit
            // - povinný znak z {0, 1}
            obj.setVylukovyJR(data[5]);

            // Seskupení spojů: Bit)
            // - povinný znak z {0, 1}
            obj.setSeskupeniSpoju(data[6]);

            // Použití označníků: Bit
            // - povinný znak z {0, 1}
            obj.setPouzitiOznacniku(data[7]);

            // Jednosměrný JŘ: Bit
            // - povinný znak z {0, 1}
            obj.setJednosmernyJR(data[8]);

            // Rezerva: DbString(5)
            // - nepovinný text
            obj.setRezerva(data[9]);

            // Číslo licence: DbString(48)
            // - nepovinný text
            obj.setCisloLicence(data[10]);

            // Platnost licence od: DbDate
            // - nepovinné datum (DDMMRRRR)
            obj.setPlatnostLicenceOd(data[11]);

            // Platnost licence do: DbDate
            // - nepovinné datum (DDMMRRRR)
            obj.setPlatnostLicenceDo(data[12]);

            // Platnost JŘ od: DbDate
            // - povinné datum (DDMMRRRR)
            obj.setPlatnostJROd(data[13]);

            // Platnost JŘ do: DbDate)
            // - povinné datum (DDMMRRRR)
            obj.setPlatnostJRDo(data[14]);

            // Rozlišení dopravce: DbLong
            // - povinné číslo, vazba do Dopravci
            obj.setRozliseniDopravce(data[15]);

            // Rozlišení linky: DbLong
            // - povinné číslo
            obj.setRozliseniLinky(data[16]);

            return obj;
        };
    }

}

