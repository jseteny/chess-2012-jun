package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class InvalidLepesException extends RuntimeException {

    private Mezo innen;
    private Mezo ide;


    public InvalidLepesException(Mezo innen, Mezo ide) {
        this.innen = innen;
        this.ide = ide;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " innen: " + innen + ", ide: " + ide;
    }
}
