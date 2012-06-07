package hu.matan.chess.e2012.h06;

/**
 * @author Setény János
 * @version 6/6/12
 */
public interface Figura {

    void igyUtne(Mezo innen, Mezo ide);

    void igyLepne(Mezo innen, Mezo ide);

    boolean azonosSzinu(Figura masik);
}