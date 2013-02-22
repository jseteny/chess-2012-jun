package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.HuszarNemLephetIgyException;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Huszar extends Figura {

    public static class FEHER_HUSZAR extends Huszar {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_HUSZAR extends Huszar {
        protected String szine() {
            return FEKETE;
        }
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        igyLepne(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        int sorKulonbseg = abs(innen.getSor() - ide.getSor());
        int oszlopKulonbseg = abs(innen.getOszlop() - ide.getOszlop());

        if (sorKulonbseg == 2 && oszlopKulonbseg == 1) {
            return;
        }

        if (oszlopKulonbseg == 2 && sorKulonbseg == 1) {
            return;
        }

        throw new HuszarNemLephetIgyException(innen, ide);
    }

    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        // A huszár mindent át tud ugorni, így nics útban semmi neki
    }

    @Override
    public List<Mezo> ezekreLephetne(Mezo innen) {
        List<Mezo> eredmeny=new ArrayList<Mezo>();

        innen.fel2().jobbra1()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.fel1().jobbra2()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.le1().jobbra2()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.le2().jobbra1()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.le2().balra1()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.le1().balra2()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.fel1().balra2()
                .addAListahozHaTablanBelulVan(eredmeny);

        innen.fel2().balra1()
                .addAListahozHaTablanBelulVan(eredmeny);

        return eredmeny;
    }

    @Override
    public List<Mezo> ezekreUthetne(Mezo innnnen) {
        return super.ezekreUthetne(innnnen);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
