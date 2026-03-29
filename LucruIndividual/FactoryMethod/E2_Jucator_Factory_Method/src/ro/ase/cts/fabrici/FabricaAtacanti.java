package ro.ase.cts.fabrici;

import ro.ase.cts.clase.AJucator;
import ro.ase.cts.clase.Atacant;

public class FabricaAtacanti implements FabricaJucatori {
    private int nrGoluri;

    public FabricaAtacanti(int nrGoluri) {
        this.nrGoluri = nrGoluri;
    }

    public void setNrGoluri(int nrGoluri) {
        this.nrGoluri = nrGoluri;
    }

    @Override
    public AJucator creeazaJucator(String nume, int nrTricou, boolean esteCapitanulEchipei) {
        return new Atacant(nume, nrTricou, esteCapitanulEchipei, nrGoluri);
    }
}
