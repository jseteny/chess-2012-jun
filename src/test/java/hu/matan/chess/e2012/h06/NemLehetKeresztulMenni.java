package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.BastyaNemLephetIgyException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class NemLehetKeresztulMenni extends KezdoAllapotTeszt {

    @Test(expected = BastyaNemLephetIgyException.class)
    public void sajatFiguranFeherBastyavalA1rolA7re() {
        tabla.lepj("a1a7");
    }
}
