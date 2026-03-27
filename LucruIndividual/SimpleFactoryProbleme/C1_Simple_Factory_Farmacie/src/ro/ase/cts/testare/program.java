package ro.ase.cts.testare;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.factory.FabricaMedicamente;
import ro.ase.cts.factory.TipMedicament;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
        FabricaMedicamente fabrica = new FabricaMedicamente("SC DRMAX SRL");
        Medicament m1 = fabrica.creareMedicament(TipMedicament.RACEALA, 35, "Parasinus");
        Medicament m2 = fabrica.creareMedicament(TipMedicament.DURERE, 37.99f, "Nurofen");
        Medicament m3 = fabrica.creareMedicament(TipMedicament.DURERE, 40, "Paduden");
        Medicament m4 = fabrica.creareMedicament(TipMedicament.BODY, 29.5f, "Mydocalm");
        Medicament m5 = fabrica.creareMedicament(TipMedicament.RACEALA, 28.75f, "Nurofen raceala si gripa");

        List<Medicament> listaMedicamente = new ArrayList<>();
        listaMedicamente.add(m1);
        listaMedicamente.add(m2);
        listaMedicamente.add(m3);
        listaMedicamente.add(m4);
        listaMedicamente.add(m5);

        System.out.println("Fabrica: " + fabrica.getDenumireFabrica() + " produce urmatoarele medicamente:\n\n");
        listaMedicamente.forEach(medicament -> System.out.println(medicament.toString()));
    }
}
