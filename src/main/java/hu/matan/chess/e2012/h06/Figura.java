package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public enum Figura {

    FEHER_GYALOG {
        @Override
        public void igyLepne(Mezo innen, Mezo ide) {
            super.igyLepne(innen, ide);    //To change body of overridden methods use File | Settings | File Templates.

            if (eloreMehet(innen, ide) && innen.egyLepes(ide)) {
                return;
            }
            if (kezdoPozicio(innen) && eloreMehet(innen, ide) && innen.ketLepes(ide)) {
                return;
            }

            throw new GyalogNemLephetIgyException(innen, ide);
        }

        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 2;
        }

        @Override
        public void igyUtne(Mezo innen, Mezo ide) {
            super.igyUtne(innen, ide);    //To change body of overridden methods use File | Settings | File Templates.

            if (atlosanEloreMehet(innen, ide)) {
                return;
            }

            throw new GyalogNemLephetIgyException(innen, ide);
        }

        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            if (ide.getSor() > innen.getSor()) {
                if (innen.fuggolegesenMehet(ide)) {
                    return true;
                }
            }

            return false;
        }

        @Override
        protected boolean atlosanEloreMehet(Mezo innen, Mezo ide) {
            if (abs(innen.getOszlop() - ide.getOszlop()) == 1) {
                if (ide.getSor() > innen.getSor()) {
                    return true;
                }
            }

            return false;
        }
    },

    FEHER_BASTYA, FEHER_HUSZAR, FEHER_FUTO, FEHER_VEZER, FEHER_KIRALY,

    FEKETE_GYALOG {
        @Override
        public void igyUtne(Mezo innen, Mezo ide) {
            FEHER_GYALOG.igyUtne(innen, ide);
        }

        @Override
        public void igyLepne(Mezo innen, Mezo ide) {
            FEHER_GYALOG.igyLepne(innen, ide);
        }

        @Override
        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 7;
        }

        @Override
        protected boolean atlosanEloreMehet(Mezo innen, Mezo ide) {
            if (abs(innen.getOszlop() - ide.getOszlop()) == 1) {
                if (ide.getSor() < innen.getSor()) {
                    return true;
                }
            }

            return false;
        }
    },

    FEKETE_BASTYA, FEKETE_HUSZAR, FEKETE_FUTO, FEKETE_VEZER, FEKETE_KIRALY;

    public void igyUtne(Mezo innen, Mezo ide) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public void igyLepne(Mezo innen, Mezo ide) {
        //To change body of created methods use File | Settings | File Templates.
    }

    protected boolean kezdoPozicio(Mezo innen) {
        return false;
    }

    protected boolean eloreMehet(Mezo innen, Mezo ide) {
        return false;
    }

    protected boolean atlosanEloreMehet(Mezo innen, Mezo ide) {
        return false;
    }
}
