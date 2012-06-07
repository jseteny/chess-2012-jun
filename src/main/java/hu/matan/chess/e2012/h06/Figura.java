package hu.matan.chess.e2012.h06;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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

    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        throw new NotImplementedException();
    }

    protected void vanEUtbanFuggolegesenFel(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        // ha nem fuggőlegesen fel vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.getOszlop() == ide.getOszlop()) {
            if (innen.getSor() < ide.getSor()) {
                char oszlop = innen.getOszlop();
                for (int sor = innen.getSor() + 1; sor < ide.getSor(); ++sor) {
                    egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
                }
            }
        }
    }

    protected void vanEUtbanFuggolegesenLe(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        // ha nem fuggőlegesen le vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.getOszlop() == ide.getOszlop()) {
            if (innen.getSor() > ide.getSor()) {
                char oszlop = innen.getOszlop();
                for (int sor = innen.getSor() - 1; sor > ide.getSor(); --sor) {
                    egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
                }
            }
        }
    }

    protected void vanEUtbanVizsintesenJobbra(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        todo
        // ha nem fuggőlegesen fel vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.getOszlop() == ide.getOszlop()) {
            if (innen.getSor() < ide.getSor()) {
                char oszlop = innen.getOszlop();
                for (int sor = innen.getSor() + 1; sor < ide.getSor(); ++sor) {
                    egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
                }
            }
        }
    }

    protected void vanEUtbanVizszintesenBalra(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        todo
        // ha nem fuggőlegesen le vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.getOszlop() == ide.getOszlop()) {
            if (innen.getSor() > ide.getSor()) {
                char oszlop = innen.getOszlop();
                for (int sor = innen.getSor() - 1; sor > ide.getSor(); --sor) {
                    egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
                }
            }
        }
    }

    protected abstract String szine();
}