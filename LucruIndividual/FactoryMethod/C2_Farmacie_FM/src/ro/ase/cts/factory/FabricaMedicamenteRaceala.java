package ro.ase.cts.factory;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentRaceala;

public class FabricaMedicamenteRaceala implements FabricaMedicamente{
    @Override
    public Medicament creeazaMedicament(float pret, String denumire) {
        return new MedicamentRaceala(pret, denumire);
    }
}
