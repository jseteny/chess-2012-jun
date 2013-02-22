package hu.matan.chess.e2012.h06;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

/**
 * @author Setény János
 * @version 6/6/12
 */
public abstract class Figura {

    public static final String FEHER = "feher";
    public static final String FEKETE = "fekete";

    public boolean azonosSzinu(Figura masik) {
        return masik.szine().equals(this.szine());
    }

    public abstract void igyUtne(Mezo innen, Mezo ide);

    public abstract void igyLepne(Mezo innen, Mezo ide);

    public abstract void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje);

    protected abstract String szine();

    protected final VanEUtbanEllenorzo vanEUtban(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
        return new VanEUtbanEllenorzo(innen, ide, egyEgyMezoEllenorzoje);
    }

    public List<Mezo> ezekreLephetne(Mezo innen) {
        return new ArrayList<Mezo>();
    }

    public List<Mezo> ezekreUthetne(Mezo innnnen) {
        //To change body of created methods use File | Settings | File Templates.
        return new ArrayList<Mezo>();
    }

    protected static class VanEUtbanEllenorzo {
        private final Mezo innen;
        private final Mezo ide;
        private final VanEIttFigura egyEgyMezoEllenorzoje;

        public VanEUtbanEllenorzo(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {
            this.innen = innen;
            this.ide = ide;
            this.egyEgyMezoEllenorzoje = egyEgyMezoEllenorzoje;
        }

        public VanEUtbanEllenorzo fel() {
            if (innen.fuggolegesenFelMehet(ide)) {
                int lepesSzam = ide.getSor() - innen.getSor();
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(0), sorLeptetoLegyen(1), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo le() {
            if (innen.fuggolegesenLeMehet(ide)) {
                int lepesSzam = innen.getSor() - ide.getSor();
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(0), sorLeptetoLegyen(-1), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo jobbra() {
            if (innen.vizszintesenJobbraMehet(ide)) {
                int lepesSzam = ide.getOszlop() - innen.getOszlop();
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(1), sorLeptetoLegyen(0), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo balra() {
            if (innen.vizszintesenBalraMehet(ide)) {
                int lepesSzam = innen.getOszlop() - ide.getOszlop();
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(-1), sorLeptetoLegyen(0), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo balraFel() {
            if (innen.atlosanBalraFelMehet(ide)) {
                int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(-1), sorLeptetoLegyen(1), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo jobbraFel() {
            if (innen.atlosanJobbraFelMehet(ide)) {
                int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(1), sorLeptetoLegyen(1), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo jobbraLe() {
            if (innen.atlosanJobbraLeMehet(ide)) {
                int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(1), sorLeptetoLegyen(-1), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        public VanEUtbanEllenorzo balraLe() {
            if (innen.atlosanBalraLeMehet(ide)) {
                int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
                vizsgaldMezonkent(innen, oszlopLeptetoLegyen(-1), sorLeptetoLegyen(-1), lepesSzam, egyEgyMezoEllenorzoje);
            }
            return this;
        }

        private void vizsgaldMezonkent(Mezo innen, int oszlopLepteto, int sorLepteto, int lepesSzam, VanEIttFigura mezoEllenorzoje) {
            char oszlop = innen.getOszlop();
            int sor = innen.getSor();

            int vizsgalandoLepes = lepesSzam - 1;
            while (vizsgalandoLepes > 0) {
                --vizsgalandoLepes;
                oszlop += oszlopLepteto;
                sor += sorLepteto;
                mezoEllenorzoje.ellenorizd(oszlop, sor);
            }
        }

        private int sorLeptetoLegyen(int ez) {
            return ez;
        }

        private int oszlopLeptetoLegyen(int ez) {
            return ez;
        }
    }
}