package hu.matan.chess.e2012.h06;

import hu.matan.chess.e2012.h06.validalas.GyalogNemLephetIgyException;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Gyalog extends Figura {

    protected static boolean szomszedosOszlop(Mezo innen, Mezo ide) {
        return abs(innen.getOszlop() - ide.getOszlop()) == 1;
    }

    @Override
    public void igyUtne(Mezo innen, Mezo ide) {
        if (atlosanEloreUthet(innen, ide)) {
            return;
        }

        throw new GyalogNemLephetIgyException(innen, ide);
    }

    @Override
    public void igyLepne(Mezo innen, Mezo ide) {
        if (eloreMehet(innen, ide) && innen.egyLepes(ide)) {
            return;
        }
        if (kezdoPozicio(innen) && eloreMehet(innen, ide) && innen.ketLepes(ide)) {
            return;
        }

        throw new GyalogNemLephetIgyException(innen, ide);
    }

    @Override
    public void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        int kulonbseg = ide.getSor() - innen.getSor();
        if (abs(kulonbseg) == 2) {
            egyEgyMezoEllenorzoje.ellenorizd(innen.getOszlop(), innen.getSor() + kulonbseg / 2);
        }
    }

    /**
     * Szin függő
     */
    protected abstract boolean kezdoPozicio(Mezo innen);

    /**
     * Szin függő
     */
    protected abstract boolean eloreMehet(Mezo innen, Mezo ide);

    /**
     * Szin függő
     */
    protected abstract boolean atlosanEloreUthet(Mezo innen, Mezo ide);

    /**
     * Szin függő
     */
    public abstract List<Mezo> ezekreLephetne(Mezo innen);

    /**
     * Szin függő
     */
    public abstract ArrayList<Mezo> ezekreUthetne(Mezo innen);

    public static class FEHER_GYALOG extends Gyalog {

        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 2;
        }

        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            return innen.fuggolegesenFelMehet(ide);
        }

        protected boolean atlosanEloreUthet(Mezo innen, Mezo ide) {
            return szomszedosOszlop(innen, ide) && ide.getSor() == innen.getSor() + 1;
        }

        @Override
        public List<Mezo> ezekreLephetne(Mezo innen) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public ArrayList<Mezo> ezekreUthetne(Mezo innen) {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        protected String szine() {
            return FEHER;
        }
    }

    public static class FEKETE_GYALOG extends Gyalog {


        protected boolean kezdoPozicio(Mezo innen) {
            return innen.getSor() == 7;
        }

        protected boolean eloreMehet(Mezo innen, Mezo ide) {
            return innen.fuggolegesenLeMehet(ide);
        }

        protected boolean atlosanEloreUthet(Mezo innen, Mezo ide) {
            return szomszedosOszlop(innen, ide) && ide.getSor() == innen.getSor() - 1;
        }

        @Override
        public List<Mezo> ezekreLephetne(Mezo innen) {
            ArrayList<Mezo> lista = new ArrayList<Mezo>();
            if (kezdoPozicio(innen)) {
                lista.add(innen.leEnnyit(1));
                lista.add(innen.leEnnyit(2));
            } else {
                lista.add(innen.leEnnyit(1));
            }
            return lista;
        }

        @Override
        public ArrayList<Mezo> ezekreUthetne(Mezo innen) {
            ArrayList<Mezo> lista = new ArrayList<Mezo>();
            lista.add(innen.leJobbra());
            lista.add(innen.leBalra());
            return lista;
        }

        protected String szine() {
            return FEKETE;
        }

    }
}
