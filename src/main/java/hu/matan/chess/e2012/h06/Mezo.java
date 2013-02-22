package hu.matan.chess.e2012.h06;

import java.util.List;

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
        return "" + oszlop + sor;
    }

    public boolean fuggolegesenMehet(Mezo ide) {
        return oszlop == ide.oszlop && sor != ide.sor;
    }

    public boolean vizszintesenMehet(Mezo ide) {
        return sor == ide.sor && oszlop != ide.oszlop;
    }

    public boolean atlosanMehet(Mezo ide) {
        return Math.abs(ide.sor - sor) == Math.abs(ide.oszlop - oszlop);
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


    private boolean felMehet(Mezo ide) {
        return ide.sor > sor;
    }

    private boolean leMehet(Mezo ide) {
        return ide.sor < sor;
    }

    private boolean balraMehet(Mezo ide) {
        return ide.oszlop < oszlop;
    }

    private boolean jobbraMehet(Mezo ide) {
        return ide.oszlop > oszlop;
    }


    public boolean atlosanBalraFelMehet(Mezo ide) {
        return atlosanMehet(ide) && balraMehet(ide) && felMehet(ide);
    }

    public boolean atlosanJobbraFelMehet(Mezo ide) {
        return atlosanMehet(ide) && jobbraMehet(ide) && felMehet(ide);
    }

    public boolean atlosanJobbraLeMehet(Mezo ide) {
        return atlosanMehet(ide) && jobbraMehet(ide) && leMehet(ide);
    }

    public boolean atlosanBalraLeMehet(Mezo ide) {
        return atlosanMehet(ide) && balraMehet(ide) && leMehet(ide);
    }

    public boolean egyLepes(Mezo cel) {
        if (cel.equals(this))
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

    public Mezo leEnnyit(int ennyit) {
        return Mezo.at(oszlop, sor - ennyit);
    }

    public Mezo leJobbra() {
        return Mezo.at((char) (oszlop + 1), sor - 1);
    }

    public Mezo leBalra() {
        return Mezo.at((char) (oszlop - 1), sor - 1);
    }

    public Mezo fel1() {
        return new Mezo(oszlop, sor + 1);
    }

    public Mezo fel2() {
        return new Mezo(oszlop, sor + 2);
    }

    public Mezo jobbra1() {
        return new Mezo((char) (oszlop + 1), sor);
    }

    public Mezo jobbra2() {
        return new Mezo((char) (oszlop + 2), sor);
    }

    public Mezo le1() {
        return new Mezo(oszlop, sor - 1);
    }

    public Mezo le2() {
        return new Mezo(oszlop, sor - 2);
    }

    public Mezo balra1() {
        return new Mezo((char) (oszlop - 1), sor);
    }

    public Mezo balra2() {
        return new Mezo((char) (oszlop - 2), sor);
    }

    public void addAListahozHaTablanBelulVan(List<Mezo> eredmeny) {
        if ('a' <= oszlop && oszlop <= 'h') {
            if (1 <= sor && sor <= 8) {
                eredmeny.add(this);
            }
        }
    }
}
