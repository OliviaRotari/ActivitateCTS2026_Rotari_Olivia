package ro.ase.cts.factory;

import ro.ase.cts.clase.Medicament;

public interface FabricaMedicamente {
    Medicament creeazaMedicament(float pret, String denumire);
}
