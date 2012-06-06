package hu.matan.chess.e2012.h06;

import java.util.HashMap;
import java.util.Map;

import static hu.matan.chess.e2012.h06.Figura.FEHER_GYALOG;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class SakkTabla {

    private Map<String, Figura> tabla = new HashMap<String, Figura>();

    public SakkTabla() {
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            tabla.put("" + oszlop + 2, FEHER_GYALOG);
        }
    }

    public Figura at(String hely) {
        return tabla.get(hely);
    }
}
