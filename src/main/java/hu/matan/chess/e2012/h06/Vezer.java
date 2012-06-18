package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.VezerNemLephetIgyException;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Vezer extends Figura {

    public static class FEHER_VEZER extends Vezer {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_VEZER extends Vezer {
        protected String szine() {
            return FEKETE;
        }
    }


    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        vanEUtbanAtlosanBalraFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanAtlosanBalraLe(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanAtlosanJobbraFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanAtlosanJobbraLe(innen, ide, egyEgyMezoEllenorzoje);

        vanEUtbanFuggolegesenFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanFuggolegesenLe(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanVizszintesenBalra(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanVizszintesenJobbra(innen, ide, egyEgyMezoEllenorzoje);
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        igyLepne(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        if (innen.atlosanMehet(ide)
                || innen.fuggolegesenMehet(ide)
                || innen.vizszintesenMehet(ide)) {

            return;
        }

        throw new VezerNemLephetIgyException(innen, ide);
    }
}

