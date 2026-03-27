package ro.ase.cts.SingletonProbleme.program;

import ro.ase.cts.SingletonProbleme.clase.FelDeMancare;
import ro.ase.cts.SingletonProbleme.enums.TipDesert;
import ro.ase.cts.SingletonProbleme.enums.TipSupa;
import ro.ase.cts.SingletonProbleme.factory.FabricaDesert;
import ro.ase.cts.SingletonProbleme.factory.FabricaFelDeMancare;
import ro.ase.cts.SingletonProbleme.factory.FabricaSupa;

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