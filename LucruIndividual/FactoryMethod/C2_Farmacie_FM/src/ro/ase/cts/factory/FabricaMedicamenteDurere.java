package ro.ase.cts.factory;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentDurere;

public class FabricaMedicamenteDurere implements FabricaMedicamente{
    @Override
    public Medicament creeazaMedicament(float pret, String denumire) {
        return new MedicamentDurere(pret, denumire);
    }
}
