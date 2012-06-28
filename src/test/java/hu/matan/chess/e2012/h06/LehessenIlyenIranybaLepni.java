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

    @Test
    public void feketeBastyavalH8rolH5re() {
        tabla.lepj("h7h5");
        tabla.lepj("h5h4");
        tabla.lepj("h4h3");
        tabla.lepj("h3g2");

        tabla.lepj("h8h5");
    }

    @Test
    public void feketeVezerrelD8rolD6ra() {
        tabla.lepj("d7d5");

        tabla.lepj("d8d6");
    }

    @Test
    public void feketeKirallyalE8rolE7re() {
        tabla.lepj("e7e5");

        tabla.lepj("e8e7");
    }
}
