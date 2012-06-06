package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/7/12
 */
public class Utni_ne_lehessen extends KezdoAllapotTeszt {

    @Test(expected = GyalogNemLephetIgyException.class)
    public void gyaloggalC7rolE6ra() {
        tabla.lepj("e2e4");
        tabla.lepj("e4e5");
        tabla.lepj("e5e6");

        tabla.lepj("c7e6");
    }

}
