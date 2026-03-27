package ro.ase.cts.CinemaSimpleFactory.program;

import ro.ase.cts.CinemaSimpleFactory.clase.FelDeMancare;
import ro.ase.cts.CinemaSimpleFactory.enums.TipDesert;
import ro.ase.cts.CinemaSimpleFactory.enums.TipSupa;
import ro.ase.cts.CinemaSimpleFactory.factory.FabricaDesert;
import ro.ase.cts.CinemaSimpleFactory.factory.FabricaFelDeMancare;
import ro.ase.cts.CinemaSimpleFactory.factory.FabricaSupa;

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