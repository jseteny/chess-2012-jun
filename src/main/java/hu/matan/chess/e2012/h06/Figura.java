package hu.matan.chess.e2012.h06;

import static java.lang.Math.abs;

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

    public abstract void vanEUtbanFigura(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje);

    protected void vanEUtbanFuggolegesenFel(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.fuggolegesenFelMehet(ide)) {
            int lepesSzam = ide.getSor() - innen.getSor();
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(0), sorLeptetoLegyen(1), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanFuggolegesenLe(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.fuggolegesenLeMehet(ide)) {
            int lepesSzam = innen.getSor() - ide.getSor();
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(0), sorLeptetoLegyen(-1), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanVizszintesenJobbra(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.vizszintesenJobbraMehet(ide)) {
            int lepesSzam = ide.getOszlop() - innen.getOszlop();
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(1), sorLeptetoLegyen(0), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanVizszintesenBalra(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.vizszintesenBalraMehet(ide)) {
            int lepesSzam = innen.getOszlop() - ide.getOszlop();
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(-1), sorLeptetoLegyen(0), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanAtlosanBalraFel(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.atlosanBalraFelMehet(ide)) {
            int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(-1), sorLeptetoLegyen(1), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanAtlosanJobbraFel(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.atlosanJobbraFelMehet(ide)) {
            int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(1), sorLeptetoLegyen(1), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanAtlosanJobbraLe(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.atlosanJobbraLeMehet(ide)) {
            int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(1), sorLeptetoLegyen(-1), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    protected void vanEUtbanAtlosanBalraLe(Mezo innen, Mezo ide, VanEIttFigura egyEgyMezoEllenorzoje) {

        if (innen.atlosanBalraLeMehet(ide)) {
            int lepesSzam = abs(innen.getOszlop() - ide.getOszlop());
            vizsgaldMezonkent(innen, oszlopLeptetoLegyen(-1), sorLeptetoLegyen(-1), lepesSzam, egyEgyMezoEllenorzoje);
        }
    }

    private int sorLeptetoLegyen(int ez) {
        return ez;
    }

    private int oszlopLeptetoLegyen(int ez) {
        return ez;
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

    protected abstract String szine();
}