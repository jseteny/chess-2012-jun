package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;
import hu.matan.chess.e2012.h06.validalas.UresMezoException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdesnelLepni_ne_lehessen extends KezdoAllapotTeszt {

    @Test(expected = UresMezoException.class)
    public void e3rol_e4re() {
        tabla.lepj("e3e4");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void gyalognakHarmatElore() {
        tabla.lepj("e2e5");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void gyalognakAtlosan() {
        tabla.lepj("e2f3");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void gyalognakC7rolE6ra() {
        tabla.lepj("c7e6");
    }
}
