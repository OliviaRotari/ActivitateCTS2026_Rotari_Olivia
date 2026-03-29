package ro.ase.cts.fabrici;

import ro.ase.cts.clase.AJucator;
import ro.ase.cts.clase.Portar;

public class FabricaPortari implements FabricaJucatori {
    private int nrParade;

    public FabricaPortari(int nrParade) {
        this.nrParade = nrParade;
    }

    public void setNrParade(int nrParade) {
        this.nrParade = nrParade;
    }

    @Override
    public AJucator creeazaJucator(String nume, int nrTricou, boolean esteCapitanulEchipei) {
        return new Portar(nume, nrTricou, esteCapitanulEchipei, nrParade);
    }
}
