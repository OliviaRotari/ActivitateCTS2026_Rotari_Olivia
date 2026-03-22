package ro.ase.cts.program;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.factory.FabricaDesert;
import ro.ase.cts.factory.FabricaFelDeMancare;
import ro.ase.cts.factory.FabricaSupa;

public class Main {
    public static void main(String[] args) {

        FabricaFelDeMancare fabricaFelDeMancare = new FabricaSupa();

        FelDeMancare supaDeVita = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SUPADEVITA,600,23.0);
        FelDeMancare supaDeLegume =fabricaFelDeMancare.creareFelDeMancare(TipSupa.SUPADELEGUME,300,17.00);


        FabricaFelDeMancare fabricaFelDeMancare2 = new FabricaDesert();
        FelDeMancare clatite =fabricaFelDeMancare2.creareFelDeMancare(TipDesert.CLATITE,400,350,20.00);
        FelDeMancare papanasi = fabricaFelDeMancare2.creareFelDeMancare(TipDesert.PAPANASI, 400, 100,16.00);

        supaDeLegume.afiseazaDescriere();
        supaDeVita.afiseazaDescriere();
        clatite.afiseazaDescriere();
        papanasi.afiseazaDescriere();
    }
}