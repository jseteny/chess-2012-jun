package hu.matan.chess.e2012.h06;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
    public void igyUtne(Mezo innen, Mezo ide) {
        throw new NotImplementedException();
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        throw new NotImplementedException();
    }

    @Override
    public boolean azonosSzinu(Figura masik) {
        throw new NotImplementedException();
    }
}
