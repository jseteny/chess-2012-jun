package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class CsakHuszarralLehetAtugraniException extends NemLephetIgyException {

    private Mezo ezt;


    public CsakHuszarralLehetAtugraniException(Mezo innen, Mezo ide, Mezo ezt) {
        super(innen, ide);
        this.ezt = ezt;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ", ezt: " + ezt;
    }
}
