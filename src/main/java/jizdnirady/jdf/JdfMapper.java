package jizdnirady.jdf;

import jizdnirady.jdf.dto.JdfUdaje;
import jizdnirady.jdf.dto.JdfZastavka;
import java.util.function.Function;

public class JdfMapper {

    /**
     * Mapuje pole stringu na objekt typu JdfZastavka.
     */
    public static Function<String[], JdfZastavka> JdfMapperToZastavka = data -> {
        JdfZastavka zastavka = new JdfZastavka();
        zastavka.setCisloZastavky(Long.parseLong(data[0]));
        zastavka.setNazevObce(data[1]);
        zastavka.setCastObce(data[2]);
        zastavka.setBlizsiMisto(data[3]);
        zastavka.setBlizkaObec(data[4]);
        zastavka.setStat(data[5]);
        zastavka.setPevnyKod1(data[6]);
        zastavka.setPevnyKod2(data[7]);
        zastavka.setPevnyKod3(data[8]);
        zastavka.setPevnyKod4(data[9]);
        zastavka.setPevnyKod5(data[10]);
        zastavka.setPevnyKod6(data[11]);
        return zastavka;
    };

    /**
     * Mapuje pole stringu na objekt JdfUdaje.
     */
    public static Function<String[], JdfUdaje> JdfMapperToUdaje = data -> {
        JdfUdaje udaje = new JdfUdaje();
        udaje.setCisloLinky(Long.parseLong(data[0]));
        udaje.setCisloUdaje(Long.parseLong(data[1]));
        udaje.setText(data[2]);
        udaje.setRozliseniLinky(Long.parseLong(data[3]));
        return udaje;
    };

}
