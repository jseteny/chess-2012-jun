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

        if (innen.fuggolegesenFelMehet(ide)) {
            char oszlop = innen.getOszlop();
            for (int sor = innen.getSor() + 1; sor < ide.getSor(); ++sor) {
                egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
            }
        }
    }

    protected void vanEUtbanFuggolegesenLe(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        // ha nem fuggőlegesen le vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.fuggolegesenLeMehet(ide)) {
            char oszlop = innen.getOszlop();
            for (int sor = innen.getSor() - 1; sor > ide.getSor(); --sor) {
                egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
            }
        }
    }

    protected void vanEUtbanVizszintesenJobbra(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        // ha nem vizszintesen jobbra vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.vizszintesenJobbraMehet(ide)) {
            char oszlop = innen.getOszlop();
            for (int sor = innen.getSor() + 1; sor < ide.getSor(); ++sor) {
                egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
            }
        }
    }

    protected void vanEUtbanVizszintesenBalra(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        // ha nem fuggőlegesen le vezet az út innen ide, akkor itt nem történik ellenörzés

        if (innen.vizszintesenBalraMehet(ide)) {
            char oszlop = innen.getOszlop();
            for (int sor = innen.getSor() - 1; sor > ide.getSor(); --sor) {
                egyEgyMezoEllenorzoje.ellenorizd(oszlop, sor);
            }
        }
    }

    protected abstract String szine();
}