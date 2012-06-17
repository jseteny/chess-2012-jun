package hu.matan.chess.e2012.h06;

import org.junit.Test;

import static hu.matan.chess.e2012.h06.Futo.FEHER_FUTO;
import static hu.matan.chess.e2012.h06.Gyalog.FEKETE_GYALOG;
import static hu.matan.chess.e2012.h06.Huszar.FEHER_HUSZAR;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

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
        assertNull("Fekete gyalog elmozdult d7-ről hogy üssön", tabla.figura("d7"));
        assertThat(tabla.figura("e6"), instanceOf(FEKETE_GYALOG.class));
    }

    @Test
    public void feherHuszarral() {
        tabla.lepj("b1c3");
        tabla.lepj("c3d5");

        tabla.lepj("d5e7");
        assertNull("Feher huszar elmozdult d5-ről hogy üssön", tabla.figura("d5"));
        assertThat(tabla.figura("e7"), instanceOf(FEHER_HUSZAR.class));
    }

    @Test
    public void feherFutoval() {
        tabla.lepj("e2e3");
        tabla.lepj("a7a6");

        tabla.lepj("f1a6");
        assertNull("Fehér futó elmozdult f1-ről hogy üssön", tabla.figura("f1"));
        assertThat(tabla.figura("a6"), instanceOf(FEHER_FUTO.class));
    }
}
