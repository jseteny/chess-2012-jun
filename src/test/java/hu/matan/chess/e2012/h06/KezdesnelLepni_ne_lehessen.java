package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;
import hu.matan.chess.e2012.h06.validalas.HuszarNemLephetIgyException;
import hu.matan.chess.e2012.h06.validalas.SajatBabutNemLehetUtniException;
import hu.matan.chess.e2012.h06.validalas.UresMezoException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class KezdesnelLepni_ne_lehessen extends KezdoAllapotTeszt {

    @Test(expected = UresMezoException.class)
    public void e3rol_e4re() {
        tabla.lepj("e3e4");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void gyalognakHarmatElore() {
        tabla.lepj("e2e5");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void feherGyalognakAtlosanLepni() {
        tabla.lepj("e2f3");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void feketeGyalognakC7rolE6ra() {
        tabla.lepj("c7e6");
    }

    @Test(expected = GyalogNemLephetIgyException.class)
    public void feherGyaloggalG2rolF7re() {
        tabla.lepj("g2f7");
    }

    @Test(expected = SajatBabutNemLehetUtniException.class)
    public void feherHuszarralB1rolD2re() {
        tabla.lepj("b1d2");
    }

    @Test(expected = HuszarNemLephetIgyException.class)
    public void feherHuszarralB1rolD3ra() {
        tabla.lepj("b1d3");
    }
}
