package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/18/12
 */
public class VezerNemLephetIgyException extends NemLephetIgyException {

    public VezerNemLephetIgyException(Mezo innen, Mezo ide) {
        super(innen, ide);
    }
}
