package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.UresMezoException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdesnelLepni_ne_Lehessen extends KezdoAllapotTeszt {

    @Test(expected = UresMezoException.class)
    public void e3rol_e4re() {
        tabla.lepj("e3e4");
    }
}
