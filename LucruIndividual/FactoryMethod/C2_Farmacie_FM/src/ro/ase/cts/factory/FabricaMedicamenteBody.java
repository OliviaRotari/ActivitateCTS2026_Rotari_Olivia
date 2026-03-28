package ro.ase.cts.factory;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentBody;

public class FabricaMedicamenteBody implements FabricaMedicamente{
    @Override
    public Medicament creeazaMedicament(float pret, String denumire) {
        return new MedicamentBody(pret,denumire);
    }
}
