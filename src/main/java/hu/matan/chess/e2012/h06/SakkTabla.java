package hu.matan.chess.e2012.h06;

import java.util.HashMap;
import java.util.Map;

import static hu.matan.chess.e2012.h06.Figura.*;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class SakkTabla {

    private Map<Mezo, Figura> tabla = new HashMap<Mezo, Figura>();

    public SakkTabla() {
        setAt('a', 8, FEKETE_BASTYA);
        setAt('b', 8, FEKETE_HUSZAR);
        setAt('c', 8, FEKETE_FUTO);

        setAt('d', 8, FEKETE_VEZER);
        setAt('e', 8, FEKETE_KIRALY);

        setAt('f', 8, FEKETE_FUTO);
        setAt('g', 8, FEKETE_HUSZAR);
        setAt('h', 8, FEKETE_BASTYA);

        int sor = 7;
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            setAt(oszlop, sor, FEKETE_GYALOG);
        }

        sor = 2;
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            setAt(oszlop, sor, FEHER_GYALOG);
        }

        setAt('a', 1, FEHER_BASTYA);
        setAt('b', 1, FEHER_HUSZAR);
        setAt('c', 1, FEHER_FUTO);

        setAt('d', 1, FEHER_VEZER);
        setAt('e', 1, FEHER_KIRALY);

        setAt('f', 1, FEHER_FUTO);
        setAt('g', 1, FEHER_HUSZAR);
        setAt('h', 1, FEHER_BASTYA);
    }

    public Figura at(String hely) {
        return tabla.get(
                new Mezo(
                        hely.charAt(0), // oszlop
                        hely.charAt(1) - '0' // sor
                )
        );
    }

    private void setAt(char oszlop, int sor, Figura figura) {
        tabla.put(new Mezo(oszlop, sor), figura);
    }
}
