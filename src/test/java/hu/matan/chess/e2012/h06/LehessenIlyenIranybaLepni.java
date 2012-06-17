package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.BastyaNemLephetIgyException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/17/12
 */
public class LehessenIlyenIranybaLepni extends KezdoAllapotTeszt {

    @Test
    public void feherFutovalF1rolA6ra() {
        tabla.lepj("e2e3");
        tabla.lepj("f1a6");
    }

    @Test(expected = BastyaNemLephetIgyException.class)

    public void feketeBastyavalH8rolH2re() {
        tabla.lepj("h7h5");
        tabla.lepj("h5h4");
        tabla.lepj("h4h3");
        tabla.lepj("h3g2");

        tabla.lepj("h1f3");
    }
}
