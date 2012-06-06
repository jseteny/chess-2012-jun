package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class UresMezoException extends RuntimeException {

    private Mezo mezo;

    public UresMezoException(Mezo mezo) {
        this.mezo = mezo;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " " + mezo;
    }
}
