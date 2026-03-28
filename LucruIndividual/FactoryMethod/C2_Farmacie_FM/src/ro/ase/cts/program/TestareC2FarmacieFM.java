package ro.ase.cts.program;

import ro.ase.cts.clase.Medicament;
import ro.ase.cts.clase.MedicamentBody;
import ro.ase.cts.factory.FabricaMedicamente;
import ro.ase.cts.factory.FabricaMedicamenteBody;
import ro.ase.cts.factory.FabricaMedicamenteDurere;
import ro.ase.cts.factory.FabricaMedicamenteRaceala;

import java.util.ArrayList;
import java.util.List;

public class TestareC2FarmacieFM {
    public static void main(String[] args) {
        FabricaMedicamente fabricaMedicamenteRaceala = new FabricaMedicamenteRaceala();
        FabricaMedicamente fabricaMedicamenteBody = new FabricaMedicamenteBody();
        FabricaMedicamente fabricaMedicamenteDurere = new FabricaMedicamenteDurere();


        List<Medicament> medicamente = new ArrayList<>();
        medicamente.add(fabricaMedicamenteRaceala.creeazaMedicament(20, "Nurofen"));
        medicamente.add(fabricaMedicamenteBody.creeazaMedicament(24, "DuroMe"));
        medicamente.add(fabricaMedicamenteDurere.creeazaMedicament(18, "Nospa"));

        System.out.println("Sunt disponibile urmatoarele medicamente: ");
        medicamente.forEach(medicament -> System.out.println(medicament.toString()));
    }

}
