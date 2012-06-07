package hu.matan.chess.e2012.h06;

import org.junit.Test;

import static hu.matan.chess.e2012.h06.Gyalog.FEHER_GYALOG;
import static hu.matan.chess.e2012.h06.Gyalog.FEKETE_GYALOG;
import static hu.matan.chess.e2012.h06.Huszar.FEKETE_HUSZAR;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdesnelLepniLehessen extends KezdoAllapotTeszt {

    @Test
    public void feherGyalognakE2rolE4re() {
        tabla.lepj("e2e4");

        assertNull("Elmozdult a gyalog e2-ről", tabla.figura("e2"));
        assertThat(tabla.figura("e4"), instanceOf(FEHER_GYALOG.class));
    }

    @Test
    public void feketeGyalognakE7rolE5re() {
        tabla.lepj("e7e5");

        assertNull("Elmozdult a gyalog e7-ről", tabla.figura("e7"));
        assertThat(tabla.figura("e5"), instanceOf(FEKETE_GYALOG.class));
    }

    @Test
    public void feketeHuszarralA6ra() {
        tabla.lepj("b8a6");

        assertNull("Elmozdult a fekete huszár b8-ról", tabla.figura("b8"));
        assertThat(tabla.figura("a6"), instanceOf(FEKETE_HUSZAR.class));
    }
}
