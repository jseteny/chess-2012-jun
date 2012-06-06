package hu.matan.chess.e2012.h06;

/**
 * @author Setény János
 * @version 6/6/12
 */
public final class Mezo {

    private char oszlop;
    private int sor;


    public Mezo(char oszlop, int sor) {
        this.oszlop = oszlop;
        this.sor = sor;
    }

    @SuppressWarnings("RedundantIfStatement")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mezo mezo = (Mezo) o;

        if (oszlop != mezo.oszlop) return false;
        if (sor != mezo.sor) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sor;
        result = 31 * result + (int) oszlop;
        return result;
    }
}
