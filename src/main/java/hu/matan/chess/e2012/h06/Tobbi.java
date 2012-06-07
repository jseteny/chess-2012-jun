package hu.matan.chess.e2012.h06;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author Setény János
 * @version 6/6/12
 */
public enum Tobbi implements Figura {

    FEHER_BASTYA, FEHER_HUSZAR, FEHER_FUTO, FEHER_VEZER, FEHER_KIRALY,

    FEKETE_BASTYA, FEKETE_HUSZAR, FEKETE_FUTO, FEKETE_VEZER, FEKETE_KIRALY;

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
