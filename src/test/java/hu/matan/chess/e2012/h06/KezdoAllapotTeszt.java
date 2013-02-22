package hu.matan.chess.e2012.h06;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdoAllapotTeszt extends OsTeszt {

    @Before
    public void allitsdKezdoHelyzetbeATablat() {
        tabla = SakkTabla.alapHelyzetben();
    }
}
