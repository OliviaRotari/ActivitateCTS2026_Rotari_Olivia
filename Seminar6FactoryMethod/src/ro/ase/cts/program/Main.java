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
        FelDeMancare supaDeVita = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeVita, 200, 20);
        FelDeMancare supaDeLegume = fabricaFelDeMancare.creareFelDeMancare(TipSupa.SupaDeLegume, 300, 25);

        fabricaFelDeMancare = new FabricaDesert();
        FelDeMancare clatite = fabricaFelDeMancare.creareFelDeMancare(TipDesert.Clatite, 500, 20, 200);
        FelDeMancare papanasi = fabricaFelDeMancare.creareFelDeMancare(TipDesert.Papanasi, 300, 35, 600);

        supaDeLegume.afisareDescriere();
        supaDeVita.afisareDescriere();
        clatite.afisareDescriere();
        papanasi.afisareDescriere();
    }
}