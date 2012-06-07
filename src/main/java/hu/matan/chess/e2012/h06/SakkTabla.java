package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.SajatBabutNemLehetUtniException;
import hu.matan.chess.e2012.h06.validalas.UresMezoException;

import java.util.HashMap;
import java.util.Map;

import static hu.matan.chess.e2012.h06.Gyalog.FEHER_GYALOG;
import static hu.matan.chess.e2012.h06.Gyalog.FEKETE_GYALOG;
import static hu.matan.chess.e2012.h06.Tobbi.*;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class SakkTabla {

    private Map<Mezo, Figura> tabla = new HashMap<Mezo, Figura>();

    public SakkTabla() {
        setFigura('a', 8, FEKETE_BASTYA);
        setFigura('b', 8, FEKETE_HUSZAR);
        setFigura('c', 8, FEKETE_FUTO);

        setFigura('d', 8, FEKETE_VEZER);
        setFigura('e', 8, FEKETE_KIRALY);

        setFigura('f', 8, FEKETE_FUTO);
        setFigura('g', 8, FEKETE_HUSZAR);
        setFigura('h', 8, FEKETE_BASTYA);

        int sor = 7;
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            setFigura(oszlop, sor, FEKETE_GYALOG);
        }

        sor = 2;
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            setFigura(oszlop, sor, FEHER_GYALOG);
        }

        setFigura('a', 1, FEHER_BASTYA);
        setFigura('b', 1, FEHER_HUSZAR);
        setFigura('c', 1, FEHER_FUTO);

        setFigura('d', 1, FEHER_VEZER);
        setFigura('e', 1, FEHER_KIRALY);

        setFigura('f', 1, FEHER_FUTO);
        setFigura('g', 1, FEHER_HUSZAR);
        setFigura('h', 1, FEHER_BASTYA);
    }

    public Figura figura(String hely) {
        return tabla.get(
                Mezo.at(hely)
        );
    }

    public Figura figura(Mezo mezo) {
        return tabla.get(mezo);
    }

    public Figura letezoFigura(Mezo mezo) {
        Figura figura = tabla.get(mezo);
        if (null == figura)
            throw new UresMezoException(mezo);
        else
            return figura;
    }

    private void setFigura(char oszlop, int sor, Figura figura) {
        tabla.put(Mezo.at(oszlop, sor), figura);
    }

    private void setFigura(Mezo mezo, Figura figura) {
        tabla.put(mezo, figura);
    }

    public void lepj(String lepes) {
        Mezo innen = Mezo.at(lepes.substring(0, 2));
        Mezo ide = Mezo.at(lepes.substring(2, 4));

        Figura figura = letezoFigura(innen);

        if (utes(ide)) {
            if (figura(innen).azonosSzinu(figura(ide))) {
                throw new SajatBabutNemLehetUtniException(innen, ide);
            }
            figura.igyUtne(innen, ide);
        } else {
            figura.igyLepne(innen, ide);
        }

        setFigura(innen, null);
        setFigura(ide, figura);
    }

    private boolean utes(Mezo ide) {
        return figura(ide) != null;
    }
}
