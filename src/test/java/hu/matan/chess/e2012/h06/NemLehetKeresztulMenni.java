package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.CsakHuszarralLehetAtugraniException;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class NemLehetKeresztulMenni extends KezdoAllapotTeszt {


    @Test(expected = CsakHuszarralLehetAtugraniException.class)

    public void sajatFiguranFeherBastyavalA1rolA8ra() {
        tabla.lepj("a1a8");
    }


    @Test(expected = CsakHuszarralLehetAtugraniException.class)

    public void sajatFiguranFeketeBastyavalA8rolA2re() {
        tabla.lepj("a8a2");
    }


    @Test(expected = CsakHuszarralLehetAtugraniException.class)

    public void sajatFiguranFeherFutovalF1rolA6ra() {
        tabla.lepj("f1a6");
    }


    @Test(expected = CsakHuszarralLehetAtugraniException.class)

    public void sajatFiguranFeherVezerrel() {
        tabla.lepj("d1d3");
    }
}
