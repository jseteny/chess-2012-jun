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

        HashSet<Mezo> keszlet = new HashSet<Mezo>(hova);
        assertTrue("uthet", keszlet.contains(Mezo.at("b4")));
        assertTrue("lephet", keszlet.contains(Mezo.at("a4")));
    }
}
