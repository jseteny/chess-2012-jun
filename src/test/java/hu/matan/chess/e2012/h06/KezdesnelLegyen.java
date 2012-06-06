package hu.matan.chess.e2012.h06;

import org.junit.Before;
import org.junit.Test;

import static hu.matan.chess.e2012.h06.Figura.*;
import static junit.framework.Assert.assertEquals;

/**
 * @author Setény János
 * @version 6/6/12
 */

public class KezdesnelLegyen {

    private SakkTabla tabla;


    @Before
    public void allitsdKezdoHelyzetbeATablat() {
        tabla = new SakkTabla();
    }

    @Test
    public void megfelelo1HelyenAFeher16babuja() {
        assertEquals(FEHER_GYALOG, tabla.at("a2"));
        assertEquals(FEHER_GYALOG, tabla.at("b2"));
        assertEquals(FEHER_GYALOG, tabla.at("c2"));
        assertEquals(FEHER_GYALOG, tabla.at("d2"));

        assertEquals(FEHER_GYALOG, tabla.at("e2"));
        assertEquals(FEHER_GYALOG, tabla.at("f2"));
        assertEquals(FEHER_GYALOG, tabla.at("g2"));
        assertEquals(FEHER_GYALOG, tabla.at("h2"));


        assertEquals(FEHER_BASTYA, tabla.at("a1"));
        assertEquals(FEHER_HUSZAR, tabla.at("b1"));
        assertEquals(FEHER_FUTO, tabla.at("c1"));

        assertEquals(FEHER_VEZER, tabla.at("d1"));
        assertEquals(FEHER_KIRALY, tabla.at("e1"));

        assertEquals(FEHER_FUTO, tabla.at("f1"));
        assertEquals(FEHER_HUSZAR, tabla.at("g1"));
        assertEquals(FEHER_BASTYA, tabla.at("h1"));
    }
}
