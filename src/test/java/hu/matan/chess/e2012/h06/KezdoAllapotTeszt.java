package hu.matan.chess.e2012.h06;

import org.junit.Before;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdoAllapotTeszt {
    protected SakkTabla tabla;

    @Before
    public void allitsdKezdoHelyzetbeATablat() {
        tabla = new SakkTabla();
    }
}
