package ro.ase.cts.program;

import ro.ase.cts.clase.AJucator;
import ro.ase.cts.fabrici.FabricaAtacanti;
import ro.ase.cts.fabrici.FabricaFundasi;
import ro.ase.cts.fabrici.FabricaJucatori;
import ro.ase.cts.fabrici.FabricaPortari;

public class TestareE2Jucatori {
    public static void main(String[] args) {
        FabricaJucatori fabricaPortari = new FabricaPortari(6);
        FabricaJucatori fabricaAtacanti = new FabricaAtacanti(4);
        FabricaJucatori fabricaFundasi = new FabricaFundasi(5);

        //creare obiecte
        AJucator portar1 = fabricaPortari.creeazaJucator("Ion Armescu", 4, false);
        portar1.descriereProfilJucator();

        AJucator portar2 = fabricaPortari.creeazaJucator("Horatiu MOLDOVAN", 12, false);
        portar2.descriereProfilJucator();

        AJucator atacant1 = fabricaAtacanti.creeazaJucator("Pavel Mirtache", 5, true);
        atacant1.descriereProfilJucator();


    }
}
