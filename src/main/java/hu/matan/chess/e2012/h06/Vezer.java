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
        vanEUtban(innen, ide, egyEgyMezoEllenorzoje)
                .balraFel()
                .jobbraFel()
                .jobbraLe()
                .balraLe();

        vanEUtban(innen, ide, egyEgyMezoEllenorzoje)
                .fel()
                .le()
                .jobbra()
                .balra();
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

