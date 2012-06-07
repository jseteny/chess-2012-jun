package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.HuszarNemLephetIgyException;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Huszar extends Figura {

    public static class FEHER_HUSZAR extends Huszar {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_HUSZAR extends Huszar {
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
        int sorKulonbseg = abs(innen.getSor() - ide.getSor());
        int oszlopKulonbseg = abs(innen.getOszlop() - ide.getOszlop());

        if (sorKulonbseg == 2 && oszlopKulonbseg == 1) {
            return;
        }

        if (oszlopKulonbseg == 2 && sorKulonbseg == 1) {
            return;
        }

        throw new HuszarNemLephetIgyException(innen, ide);
    }
}
