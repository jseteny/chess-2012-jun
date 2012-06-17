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
}
