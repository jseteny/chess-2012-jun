package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class BastyaNemLephetIgyException extends NemLephetIgyException {

    public BastyaNemLephetIgyException(Mezo innen, Mezo ide) {
        super(ide, innen);
    }
}
