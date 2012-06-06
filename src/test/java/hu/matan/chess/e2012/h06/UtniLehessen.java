package hu.matan.chess.e2012.h06;

import org.junit.Test;

/**
 * @author Setény János
 * @version 6/7/12
 */
public class UtniLehessen extends KezdoAllapotTeszt {

    @Test
    public void feketeGyaloggal() {
        tabla.lepj("e2e4");
        tabla.lepj("e4e5");
        tabla.lepj("e5e6");

        tabla.lepj("d7e6");
    }
}
