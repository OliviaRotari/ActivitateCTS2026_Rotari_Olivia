package ro.ase.cts.fabrici;

import ro.ase.cts.clase.AJucator;

public interface FabricaJucatori {
    public AJucator creeazaJucator(String nume, int nrTricou, boolean esteCapitanulEchipei);
}
