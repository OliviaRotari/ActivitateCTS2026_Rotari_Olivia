package ro.ase.cts.factory;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentBody;
import ro.ase.cts.clase.MedicamentRaceala;
import ro.ase.cts.clase.MeficamentDurere;

public class FabricaMedicamente {
    private String denumireFabrica;

    public FabricaMedicamente(String denumireFabrica) {
        this.denumireFabrica = denumireFabrica;
    }

    public String getDenumireFabrica() {
        return denumireFabrica;
    }

    public Medicament creareMedicament(TipMedicament tipMedicament, float pret, String denumire) {
        return switch (tipMedicament) {
            case BODY -> new MedicamentBody(pret, denumire);
            case DURERE -> new MeficamentDurere(pret, denumire);
            case RACEALA -> new MedicamentRaceala(pret, denumire);
            default -> null;
        };
    }
}
