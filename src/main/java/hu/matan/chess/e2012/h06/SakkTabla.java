package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.CsakHuszarralLehetAtugraniException;
import hu.matan.chess.e2012.h06.validalas.SajatFiguratNemLehetUtniException;
import hu.matan.chess.e2012.h06.validalas.UresMezoException;

import java.util.HashMap;
import java.util.Map;

import static hu.matan.chess.e2012.h06.Bastya.FEHER_BASTYA;
import static hu.matan.chess.e2012.h06.Bastya.FEKETE_BASTYA;
import static hu.matan.chess.e2012.h06.Futo.FEHER_FUTO;
import static hu.matan.chess.e2012.h06.Futo.FEKETE_FUTO;
import static hu.matan.chess.e2012.h06.Gyalog.FEHER_GYALOG;
import static hu.matan.chess.e2012.h06.Gyalog.FEKETE_GYALOG;
import static hu.matan.chess.e2012.h06.Huszar.FEHER_HUSZAR;
import static hu.matan.chess.e2012.h06.Huszar.FEKETE_HUSZAR;
import static hu.matan.chess.e2012.h06.Kiraly.FEHER_KIRALY;
import static hu.matan.chess.e2012.h06.Kiraly.FEKETE_KIRALY;
import static hu.matan.chess.e2012.h06.Vezer.FEHER_VEZER;
import static hu.matan.chess.e2012.h06.Vezer.FEKETE_VEZER;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class SakkTabla {

    private Map<Mezo, Figura> tabla = new HashMap<Mezo, Figura>();


    public SakkTabla() {
        setFigura('a', 8, new FEKETE_BASTYA());
        setFigura('b', 8, new FEKETE_HUSZAR());
        setFigura('c', 8, new FEKETE_FUTO());

        setFigura('d', 8, new FEKETE_VEZER());
        setFigura('e', 8, new FEKETE_KIRALY());

        setFigura('f', 8, new FEKETE_FUTO());
        setFigura('g', 8, new FEKETE_HUSZAR());
        setFigura('h', 8, new FEKETE_BASTYA());

        int sor = 7;
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            setFigura(oszlop, sor, new FEKETE_GYALOG());
        }

        sor = 2;
        for (char oszlop = 'a'; oszlop <= 'h'; ++oszlop) {
            setFigura(oszlop, sor, new FEHER_GYALOG());
        }

        setFigura('a', 1, new FEHER_BASTYA());
        setFigura('b', 1, new FEHER_HUSZAR());
        setFigura('c', 1, new FEHER_FUTO());

        setFigura('d', 1, new FEHER_VEZER());
        setFigura('e', 1, new FEHER_KIRALY());

        setFigura('f', 1, new FEHER_FUTO());
        setFigura('g', 1, new FEHER_HUSZAR());
        setFigura('h', 1, new FEHER_BASTYA());
    }

    public Figura figura(String hely) {
        return tabla.get(
                Mezo.at(hely)
        );
    }

    public Figura figura(Mezo mezo) {
        return tabla.get(mezo);
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

        new Lepes(innen, ide).lepj();
    }

    private boolean utes(Mezo ide) {
        return figura(ide) != null;
    }


    private class Lepes {

        private final Mezo innen;
        private final Mezo ide;
        private final Figura lepoFigura;

        public Lepes(Mezo innen, Mezo ide) {
            this.innen = innen;
            this.ide = ide;
            lepoFigura = tabla.get(innen);
        }

        private void lepj() {

            ellenorizdHogyNemUresMezorolLep();
            ellenorizdHogyNincsUtbanSemmi();

            if (utes(ide)) {
                if (figura(innen).azonosSzinu(figura(ide))) {
                    throw new SajatFiguratNemLehetUtniException(innen, ide);
                }
                lepoFigura.igyUtne(innen, ide);
            } else {
                lepoFigura.igyLepne(innen, ide);
            }

            setFigura(innen, null);
            setFigura(ide, lepoFigura);
        }

        private void ellenorizdHogyNemUresMezorolLep() {
            if (null == lepoFigura)
                throw new UresMezoException(innen);
        }

        private void ellenorizdHogyNincsUtbanSemmi() {
            lepoFigura.vanEUtbanFigura(innen, ide, new VanEIttFigura() {
                public void ellenorizd(char oszlop, int sor) {
                    if (tabla.get(Mezo.at(oszlop, sor)) != null)
                        throw new CsakHuszarralLehetAtugraniException(innen, ide, Mezo.at(oszlop, sor));
                }
            });
        }
    }
}
