package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/7/12
 */
public class NemLephetIgyException extends RuntimeException {
    protected Mezo innen;
    protected Mezo ide;

    public NemLephetIgyException(Mezo ide, Mezo innen) {
        this.ide = ide;
        this.innen = innen;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " innen: " + innen + ", ide: " + ide;
    }
}
