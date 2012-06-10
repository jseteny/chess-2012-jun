package hu.matan.chess.e2012.h06;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
@SuppressWarnings("RedundantIfStatement")
public final class Mezo {

    private char oszlop;
    private int sor;


    public static Mezo at(String hely) {
        return new Mezo(
                hely.charAt(0), // oszlop
                hely.charAt(1) - '0' // sor
        );
    }

    public static Mezo at(char oszlop, int sor) {
        return new Mezo(oszlop, sor);
    }

    private Mezo(char oszlop, int sor) {
        this.oszlop = oszlop;
        this.sor = sor;
    }

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

    @Override
    public String toString() {
        return "Mezo{" +
                "oszlop=" + oszlop +
                ", sor=" + sor +
                '}';
    }

    public boolean fuggolegesenFelMehet(Mezo ide) {
        return ide.oszlop == oszlop && ide.getSor() > getSor();
    }

    public boolean fuggolegesenLeMehet(Mezo ide) {
        return ide.oszlop == oszlop && ide.getSor() < getSor();
    }

    public boolean vizszintesenJobbraMehet(Mezo ide) {
        return ide.sor == sor && ide.getOszlop() > getOszlop();
    }

    public boolean vizszintesenBalraMehet(Mezo ide) {
        return ide.sor == sor && ide.getOszlop() < getOszlop();
    }

    public boolean egyLepes(Mezo cel) {
        if (cel == this)
            return false;

        if (abs(oszlop - cel.oszlop) > 1) {
            return false;
        }

        if (abs(sor - cel.sor) > 1) {
            return false;
        }

        return true;
    }

    public boolean ketLepes(Mezo cel) {
        if (abs(oszlop - cel.oszlop) == 2) {
            return true;
        }

        if (abs(sor - cel.sor) == 2) {
            return true;
        }

        return false;
    }

    public int getSor() {
        return sor;
    }

    public char getOszlop() {
        return oszlop;
    }
}
