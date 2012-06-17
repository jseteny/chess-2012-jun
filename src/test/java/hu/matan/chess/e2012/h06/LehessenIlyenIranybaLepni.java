package hu.matan.chess.e2012.h06;

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
}
