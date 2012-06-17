package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/17/12
 */
public class FutoNemLephetIgyException extends NemLephetIgyException {

    public FutoNemLephetIgyException(Mezo innen, Mezo ide) {
        super(ide, innen);
    }
}
