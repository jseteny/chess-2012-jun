package hu.matan.chess.e2012.h06;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Bastya extends Figura {

    public static class FEHER_BASTYA extends Bastya {
        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_BASTYA extends Bastya {
        protected String szine() {
            return FEKETE;
        }
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        throw new NotImplementedException();
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        throw new NotImplementedException();
    }

    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        vanEUtbanFuggolegesenFel(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanFuggolegesenLe(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanVizsintesenJobbra(innen, ide, egyEgyMezoEllenorzoje);
        vanEUtbanVizszintesenBalra(innen, ide, egyEgyMezoEllenorzoje);
    }
}
