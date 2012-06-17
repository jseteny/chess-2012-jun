package hu.matan.chess.e2012.h06;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
        throw new NotImplementedException();
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        throw new NotImplementedException();
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        throw new NotImplementedException();
    }
}
