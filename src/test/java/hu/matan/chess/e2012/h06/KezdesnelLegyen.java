package hu.matan.chess.e2012.h06;

import org.junit.Test;

import static hu.matan.chess.e2012.h06.Bastya.FEHER_BASTYA;
import static hu.matan.chess.e2012.h06.Bastya.FEKETE_BASTYA;
import static hu.matan.chess.e2012.h06.Futo.FEHER_FUTO;
import static hu.matan.chess.e2012.h06.Futo.FEKETE_FUTO;
import static hu.matan.chess.e2012.h06.Gyalog.FEHER_GYALOG;
import static hu.matan.chess.e2012.h06.Gyalog.FEKETE_GYALOG;
import static hu.matan.chess.e2012.h06.Huszar.FEHER_HUSZAR;
import static hu.matan.chess.e2012.h06.Huszar.FEKETE_HUSZAR;
import static hu.matan.chess.e2012.h06.Kiraly.FEHER_KIRALY;
import static hu.matan.chess.e2012.h06.Kiraly.FEKETE_KIRALY;
import static hu.matan.chess.e2012.h06.Vezer.FEHER_VEZER;
import static hu.matan.chess.e2012.h06.Vezer.FEKETE_VEZER;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;


/**
 * @author Setény János
 * @version 6/6/12
 */

public class KezdesnelLegyen extends KezdoAllapotTeszt {

    @Test
    public void megfeleloHelyenAFeher16babuja() {
        assertThat(tabla.figura("a2"), instanceOf(FEHER_GYALOG.class));
        assertThat(tabla.figura("b2"), instanceOf(FEHER_GYALOG.class));
        assertThat(tabla.figura("c2"), instanceOf(FEHER_GYALOG.class));
        assertThat(tabla.figura("d2"), instanceOf(FEHER_GYALOG.class));

        assertThat(tabla.figura("e2"), instanceOf(FEHER_GYALOG.class));
        assertThat(tabla.figura("f2"), instanceOf(FEHER_GYALOG.class));
        assertThat(tabla.figura("g2"), instanceOf(FEHER_GYALOG.class));
        assertThat(tabla.figura("h2"), instanceOf(FEHER_GYALOG.class));


        assertThat(tabla.figura("a1"), instanceOf(FEHER_BASTYA.class));
        assertThat(tabla.figura("b1"), instanceOf(FEHER_HUSZAR.class));
        assertThat(tabla.figura("c1"), instanceOf(FEHER_FUTO.class));

        assertThat(tabla.figura("d1"), instanceOf(FEHER_VEZER.class));
        assertThat(tabla.figura("e1"), instanceOf(FEHER_KIRALY.class));

        assertThat(tabla.figura("f1"), instanceOf(FEHER_FUTO.class));
        assertThat(tabla.figura("g1"), instanceOf(FEHER_HUSZAR.class));
        assertThat(tabla.figura("h1"), instanceOf(FEHER_BASTYA.class));
    }

    @Test
    public void megfeleloHelyenAFekete16babuja() {
        assertThat(tabla.figura("a7"), instanceOf(FEKETE_GYALOG.class));
        assertThat(tabla.figura("b7"), instanceOf(FEKETE_GYALOG.class));
        assertThat(tabla.figura("c7"), instanceOf(FEKETE_GYALOG.class));
        assertThat(tabla.figura("d7"), instanceOf(FEKETE_GYALOG.class));

        assertThat(tabla.figura("e7"), instanceOf(FEKETE_GYALOG.class));
        assertThat(tabla.figura("f7"), instanceOf(FEKETE_GYALOG.class));
        assertThat(tabla.figura("g7"), instanceOf(FEKETE_GYALOG.class));
        assertThat(tabla.figura("h7"), instanceOf(FEKETE_GYALOG.class));


        assertThat(tabla.figura("a8"), instanceOf(FEKETE_BASTYA.class));
        assertThat(tabla.figura("b8"), instanceOf(FEKETE_HUSZAR.class));
        assertThat(tabla.figura("c8"), instanceOf(FEKETE_FUTO.class));

        assertThat(tabla.figura("d8"), instanceOf(FEKETE_VEZER.class));
        assertThat(tabla.figura("e8"), instanceOf(FEKETE_KIRALY.class));

        assertThat(tabla.figura("f8"), instanceOf(FEKETE_FUTO.class));
        assertThat(tabla.figura("g8"), instanceOf(FEKETE_HUSZAR.class));
        assertThat(tabla.figura("h8"), instanceOf(FEKETE_BASTYA.class));
    }
}
