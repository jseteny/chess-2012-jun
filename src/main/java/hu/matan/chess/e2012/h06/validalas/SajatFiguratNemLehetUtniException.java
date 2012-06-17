package hu.matan.chess.e2012.h06.validalas;

import hu.matan.chess.e2012.h06.Mezo;

/**
 * @author Setény János
 * @version 6/7/12
 */
public class SajatFiguratNemLehetUtniException extends InvalidLepesException {

    public SajatFiguratNemLehetUtniException(Mezo innen, Mezo ide) {
        super(innen, ide);
    }
}
