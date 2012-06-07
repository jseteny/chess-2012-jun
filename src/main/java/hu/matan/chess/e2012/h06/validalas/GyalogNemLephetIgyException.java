package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class GyalogNemLephetIgyException extends NemLephetIgyException {

    public GyalogNemLephetIgyException(Mezo innen, Mezo ide) {
        super(innen, ide);
    }
}
