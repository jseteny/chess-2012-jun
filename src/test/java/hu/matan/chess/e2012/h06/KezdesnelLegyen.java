package hu.matan.chess.e2012.h06;

import org.junit.Test;

import static hu.matan.chess.e2012.h06.Figura.*;
import static junit.framework.Assert.assertEquals;

/**
 * @author Setény János
 * @version 6/6/12
 */

public class KezdesnelLegyen extends KezdoAllapotTeszt {

    @Test
    public void megfeleloHelyenAFeher16babuja() {
        assertEquals(FEHER_GYALOG, tabla.figura("a2"));
        assertEquals(FEHER_GYALOG, tabla.figura("b2"));
        assertEquals(FEHER_GYALOG, tabla.figura("c2"));
        assertEquals(FEHER_GYALOG, tabla.figura("d2"));

        assertEquals(FEHER_GYALOG, tabla.figura("e2"));
        assertEquals(FEHER_GYALOG, tabla.figura("f2"));
        assertEquals(FEHER_GYALOG, tabla.figura("g2"));
        assertEquals(FEHER_GYALOG, tabla.figura("h2"));


        assertEquals(FEHER_BASTYA, tabla.figura("a1"));
        assertEquals(FEHER_HUSZAR, tabla.figura("b1"));
        assertEquals(FEHER_FUTO, tabla.figura("c1"));

        assertEquals(FEHER_VEZER, tabla.figura("d1"));
        assertEquals(FEHER_KIRALY, tabla.figura("e1"));

        assertEquals(FEHER_FUTO, tabla.figura("f1"));
        assertEquals(FEHER_HUSZAR, tabla.figura("g1"));
        assertEquals(FEHER_BASTYA, tabla.figura("h1"));
    }

    @Test
    public void megfeleloHelyenAFekete16babuja() {
        assertEquals(FEKETE_GYALOG, tabla.figura("a7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("b7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("c7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("d7"));

        assertEquals(FEKETE_GYALOG, tabla.figura("e7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("f7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("g7"));
        assertEquals(FEKETE_GYALOG, tabla.figura("h7"));


        assertEquals(FEKETE_BASTYA, tabla.figura("a8"));
        assertEquals(FEKETE_HUSZAR, tabla.figura("b8"));
        assertEquals(FEKETE_FUTO, tabla.figura("c8"));

        assertEquals(FEKETE_VEZER, tabla.figura("d8"));
        assertEquals(FEKETE_KIRALY, tabla.figura("e8"));

        assertEquals(FEKETE_FUTO, tabla.figura("f8"));
        assertEquals(FEKETE_HUSZAR, tabla.figura("g8"));
        assertEquals(FEKETE_BASTYA, tabla.figura("h8"));
    }
}
