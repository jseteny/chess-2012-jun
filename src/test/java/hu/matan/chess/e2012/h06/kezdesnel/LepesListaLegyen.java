package hu.matan.chess.e2012.h06.kezdesnel;

import hu.matan.chess.e2012.h06.KezdoAllapotTeszt;
import hu.matan.chess.e2012.h06.Mezo;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * @author janos.seteny
 * @since 2013.02.06.
 */
public class LepesListaLegyen extends KezdoAllapotTeszt {

    @Test
    public void a7feketeGyalognakA6esA5() {
        List<Mezo> hova = tabla.hovaLephet("a7");
        assertEquals("Kezdohelyzetbol 1-et vagy 2-ot lephet a gyalog", 2, hova.size());
    }

    @Test
    public void feketeGyalognakUtes() {
        tabla.lepj("b2b3");
        tabla.lepj("a7a5");
        tabla.lepj("b3b4");
        List<Mezo> hova = tabla.hovaLephet("a5");
        assertEquals("Uthet is lephet is a gyalog ha van mit utni", 2, hova.size());

        assertKozteVan(hova, "b4");
        assertKozteVan(hova, "a4");
    }

    @Test
    public void feherHuszarInduloHelyzetbol() {
        List<Mezo> hova = tabla.hovaLephet("b1");
        assertEquals("Két helyre léphet", 2, hova.size());

        assertKozteVan(hova, "a3");
        assertKozteVan(hova, "c3");
    }

    @Test
    public void feketeHuszarE5Kozeprol() {
        tabla.lepj("b8c6");
        tabla.lepj("c6e5");
        List<Mezo> hova = tabla.hovaLephet("e5");
        assertEquals("Hat helyre léphet, ha a saját gyalogjai akadályozzák", 6, hova.size());

        assertKozteVan(hova, "g6");
        assertKozteVan(hova, "g4");

        assertKozteVan(hova, "f3");
        assertKozteVan(hova, "d3");

        assertKozteVan(hova, "c4");
        assertKozteVan(hova, "c6");
    }

    @Test
    public void feketeHuszarD4Kozeprol() {
        tabla.lepj("b8c6");
        tabla.lepj("c6d4");
        List<Mezo> hova = tabla.hovaLephet("d4");
        assertEquals("Nyolc helyre léphet, ha a saját gyalogjai NEM akadályozzák", 8, hova.size());

        assertKozteVan(hova, "c6");
        assertKozteVan(hova, "e6");

        assertKozteVan(hova, "f5");
        assertKozteVan(hova, "f3");

        assertKozteVan(hova, "e2");
        assertKozteVan(hova, "c2");

        assertKozteVan(hova, "b3");
        assertKozteVan(hova, "b5");
    }

    private void assertKozteVan(List<Mezo> lista, String mezo) {
        HashSet<Mezo> keszlet = new HashSet<Mezo>(lista);
        assertTrue(testName.getMethodName() + " - A lehetséges lépések között van a(z) " + mezo, keszlet.contains(Mezo.at(mezo)));
    }
}
