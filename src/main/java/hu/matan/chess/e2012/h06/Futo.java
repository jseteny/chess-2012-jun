package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.FutoNemLephetIgyException;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Futo extends Figura {

    public static class FEHER_FUTO extends Futo {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_FUTO extends Futo {
        protected String szine() {
            return FEKETE;
        }
    }

    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        vanEUtbanAtlosanBalraFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanAtlosanJobbraFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanAtlosanJobbraLe(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanAtlosanBalraLe(innen, ide, egyEgyMezoEllenorzoje);
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        igyLepne(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        if (innen.atlosanMehet(ide)) {
            return;
        }

        throw new FutoNemLephetIgyException(innen, ide);
    }
}
