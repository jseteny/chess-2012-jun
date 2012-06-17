package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.FutoNemLephetIgyException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/17/12
 */
public class NeLehessenIlyenIranybaLepni extends KezdoAllapotTeszt {

    @Test(expected = FutoNemLephetIgyException.class)

    public void feherFutovalF1rolA7re() {
        tabla.lepj("f1a7");
    }

    @Test
    public void feketeBastyavalH8rolH5re() {
        tabla.lepj("h7h5");
        tabla.lepj("h5h4");
        tabla.lepj("h4h3");
        tabla.lepj("h3g2");

        tabla.lepj("h8h5");
    }
}