package hu.matan.chess.e2012.h06;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Figura {

    public final String FEHER = "feher";
    public final String FEKETE = "fekete";


    public boolean azonosSzinu(Figura masik) {
        return masik.szine().equals(this.szine());
    }

    public abstract void igyUtne(Mezo innen, Mezo ide);

    public abstract void igyLepne(Mezo innen, Mezo ide);

    protected abstract String szine();
}