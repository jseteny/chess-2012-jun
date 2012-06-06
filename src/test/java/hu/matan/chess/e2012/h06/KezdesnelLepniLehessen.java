package hu.matan.chess.e2012.h06;

import org.junit.Test;

import static hu.matan.chess.e2012.h06.Figura.FEHER_GYALOG;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdesnelLepniLehessen extends KezdoAllapotTeszt {

    @Test
    public void gyalognakE2rolE4re() {
        tabla.lepj("e2e4");

        assertNull("Elmozdult a gyalog e2-ről", tabla.figura("e2"));
        assertEquals(FEHER_GYALOG, tabla.figura("e4"));
    }
}
