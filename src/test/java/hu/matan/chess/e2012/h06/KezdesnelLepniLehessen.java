package hu.matan.chess.e2012.h06;

import org.junit.Test;

import static hu.matan.chess.e2012.h06.Gyalog.FEHER_GYALOG;
import static hu.matan.chess.e2012.h06.Gyalog.FEKETE_GYALOG;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdesnelLepniLehessen extends KezdoAllapotTeszt {

    @Test
    public void feherGyalognakE2rolE4re() {
        tabla.lepj("e2e4");

        assertNull("Elmozdult a gyalog e2-ről", tabla.figura("e2"));
        assertEquals(FEHER_GYALOG, tabla.figura("e4"));
    }

    @Test
    public void feketeGyalognakE7rolE5re() {
        tabla.lepj("e7e5");

        assertNull("Elmozdult a gyalog e7-ről", tabla.figura("e7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("e5"));
    }
}
