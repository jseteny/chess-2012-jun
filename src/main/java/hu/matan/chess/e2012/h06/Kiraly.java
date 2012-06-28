package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.KiralyNemLephetIgyException;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Kiraly extends Figura {

    public static class FEHER_KIRALY extends Kiraly {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_KIRALY extends Kiraly {
        protected String szine() {
            return FEKETE;
        }
    }


    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        // csak 1 távolságra lép, így sosincs útban semmi
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        igyLepne(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        if (innen.egyLepes(ide)) {
            return;
        }

        throw new KiralyNemLephetIgyException(innen, ide);
    }
}
