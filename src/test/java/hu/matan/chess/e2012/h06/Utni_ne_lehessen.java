package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;
import hu.matan.chess.e2012.h06.validalas.SajatFiguratNemLehetUtniException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/7/12
 */
public class Utni_ne_lehessen extends KezdoAllapotTeszt {


    @Test(expected = GyalogNemLephetIgyException.class)

    public void gyaloggalC7rolE6ra() {
        tabla.lepj("e2e4");
        tabla.lepj("e4e5");
        tabla.lepj("e5e6");

        tabla.lepj("c7e6");
    }


    @Test(expected = SajatFiguratNemLehetUtniException.class)

    public void gyaloggalSajatBabut() {
        tabla.lepj("e2e3");
        tabla.lepj("f2e3");
    }


    @Test(expected = SajatFiguratNemLehetUtniException.class)

    public void huszarralF7re() {
        tabla.lepj("g8f7");
    }


    @Test(expected = SajatFiguratNemLehetUtniException.class)

    public void feketeFutovalF8rolE7re() {
        tabla.lepj("f8e7");
    }


    @Test(expected = SajatFiguratNemLehetUtniException.class)

    public void feketeKirallyalE8rolE7re() {
        tabla.lepj("e8e7");
    }


    @Test(expected = SajatFiguratNemLehetUtniException.class)

    public void feherKirallyalE1rolD1re() {
        tabla.lepj("e1d1");
    }


    @Test(expected = SajatFiguratNemLehetUtniException.class)

    public void feherKirallyalE1rolD2re() {
        tabla.lepj("e1d2");
    }
}
