package hu.matan.chess.e2012.h06.parasztoknelkulkezdesnel;

import hu.matan.chess.e2012.h06.*;
import hu.matan.chess.e2012.h06.validalas.CsakHuszarralLehetAtugraniException;
import hu.matan.chess.e2012.h06.validalas.SajatFiguratNemLehetUtniException;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Setény János
 * @version 6/6/12
 */
public class ParasztokNelkulitTeszt extends OsTeszt {

    /*
    protected class MockSakkTabla extends SakkTabla {
        @Override
        public void setFigura(char oszlop, int sor, Figura figura) {
            super.setFigura(oszlop, sor, figura);
        }
    }
      */

    @Before
    public void allitsdKezdoHelyzetbeATablat() {
        tabla = SakkTabla.uresen();
        setFigura('a', 8, new Bastya.FEKETE_BASTYA());
        setFigura('b', 8, new Huszar.FEKETE_HUSZAR());
        setFigura('c', 8, new Futo.FEKETE_FUTO());

        setFigura('d', 8, new Vezer.FEKETE_VEZER());
        setFigura('e', 8, new Kiraly.FEKETE_KIRALY());

        setFigura('f', 8, new Futo.FEKETE_FUTO());
        setFigura('g', 8, new Huszar.FEKETE_HUSZAR());
        setFigura('h', 8, new Bastya.FEKETE_BASTYA());


        setFigura('a', 1, new Bastya.FEHER_BASTYA());
        setFigura('b', 1, new Huszar.FEHER_HUSZAR());
        setFigura('c', 1, new Futo.FEHER_FUTO());

        setFigura('d', 1, new Vezer.FEHER_VEZER());
        setFigura('e', 1, new Kiraly.FEHER_KIRALY());

        setFigura('f', 1, new Futo.FEHER_FUTO());
        setFigura('g', 1, new Huszar.FEHER_HUSZAR());
        setFigura('h', 1, new Bastya.FEHER_BASTYA());
    }

    private void setFigura(char oszlop, int sor, Figura figura) {
        tabla.setFigura(oszlop, sor, figura);
    }

    @Test(expected = CsakHuszarralLehetAtugraniException.class)
    public void feherFutoUtjabanJobbraFelSajatFigura() {
        tabla.setFigura('d', 2, new Gyalog.FEHER_GYALOG());

        tabla.lepj("c1e3");
    }

    @Test(expected = CsakHuszarralLehetAtugraniException.class)
    public void feketeBastyaUtjabanSajatFigura() {
        tabla.lepj("a8c8");
    }

    @Test(expected = CsakHuszarralLehetAtugraniException.class)
    public void feherBastyaUtjabanSajatFigura() {
        tabla.lepj("h1f1");
    }
}
