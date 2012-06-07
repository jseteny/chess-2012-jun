package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public enum Gyalog implements Figura {

    FEHER_GYALOG {
        @Override
        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 2;
        }


        @Override
        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            if (ide.getSor() > innen.getSor()) {
                if (innen.fuggolegesenMehet(ide)) {
                    return true;
                }
            }

            return false;
        }

        @Override
        protected boolean atlosanEloreUthet(Mezo innen, Mezo ide) {
            if (abs(innen.getOszlop() - ide.getOszlop()) == 1) {
                if (ide.getSor() > innen.getSor()) {
                    return true;
                }
            }

            return false;
        }

        @Override
        public boolean azonosSzinu(Figura masik) {
            return masik.getClass() == FEHER_GYALOG.getClass();
        }
    },


    FEKETE_GYALOG {
        @Override
        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 7;
        }

        @Override
        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            if (ide.getSor() < innen.getSor()) {
                if (innen.fuggolegesenMehet(ide)) {
                    return true;
                }
            }

            return false;
        }

        @Override
        protected boolean atlosanEloreUthet(Mezo innen, Mezo ide) {
            if (abs(innen.getOszlop() - ide.getOszlop()) == 1) {
                if (ide.getSor() < innen.getSor()) {
                    return true;
                }
            }

            return false;
        }

        @Override
        public boolean azonosSzinu(Figura masik) {
            return masik.getClass() == FEKETE_GYALOG.getClass();
        }
    };


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
