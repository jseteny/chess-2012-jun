package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.BastyaNemLephetIgyException;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Bastya extends Figura {

    public static class FEHER_BASTYA extends Bastya {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_BASTYA extends Bastya {
        protected String szine() {
            return FEKETE;
        }
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        igyLepne(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        if (innen.fuggolegesenMehet(ide) || innen.vizszintesenMehet(ide)) {
            return;
        }

        throw new BastyaNemLephetIgyException(innen, ide);
    }

    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        vanEUtbanFuggolegesenFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanFuggolegesenLe(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanVizszintesenJobbra(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanVizszintesenBalra(innen, ide, egyEgyMezoEllenorzoje);
    }
}
