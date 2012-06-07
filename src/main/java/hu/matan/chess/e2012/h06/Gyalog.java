package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Gyalog extends Figura {

    public static class FEHER_GYALOG extends Gyalog {
        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 2;
        }

        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            return ide.getSor() > innen.getSor() && innen.fuggolegesenMehet(ide);
        }

        protected boolean atlosanEloreUthet(Mezo innen, Mezo ide) {
            return abs(innen.getOszlop() - ide.getOszlop()) == 1 && ide.getSor() > innen.getSor();
        }

        protected String szine() {
            return FEHER;
        }
    }


    public static class FEKETE_GYALOG extends Gyalog {
        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 7;
        }

        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            return ide.getSor() < innen.getSor() && innen.fuggolegesenMehet(ide);
        }

        protected boolean atlosanEloreUthet(Mezo innen, Mezo ide) {
            return abs(innen.getOszlop() - ide.getOszlop()) == 1 && ide.getSor() < innen.getSor();
        }

        protected String szine() {
            return FEKETE;
        }
    }


    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        if (atlosanEloreUthet(innen, ide)) {
            return;
        }

        throw new GyalogNemLephetIgyException(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        if (eloreMehet(innen, ide) && innen.egyLepes(ide)) {
            return;
        }
        if (kezdoPozicio(innen) && eloreMehet(innen, ide) && innen.ketLepes(ide)) {
            return;
        }

        throw new GyalogNemLephetIgyException(innen, ide);
    }

    protected abstract boolean kezdoPozicio(Mezo innen);

    protected abstract boolean eloreMehet(Mezo innen, Mezo ide);

    protected abstract boolean atlosanEloreUthet(Mezo innen, Mezo ide);
}
