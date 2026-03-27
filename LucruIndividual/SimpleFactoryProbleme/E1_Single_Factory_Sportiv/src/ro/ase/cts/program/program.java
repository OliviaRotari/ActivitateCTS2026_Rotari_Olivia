package ro.ase.cts.program;

import ro.ase.cts.clase.AJucator;
import ro.ase.cts.factory.FabricaJucatori;
import ro.ase.cts.factory.TipJucator;

public class program {
    public static void main(String[] args) {
        FabricaJucatori fabrica = new FabricaJucatori();
        AJucator portar = fabrica.creeazaJucator(TipJucator.PORTAR,"Marin Georgescu",false,21,9);
        AJucator fundas=fabrica.creeazaJucator(TipJucator.FUNDAS,"Mihail Petrescu", false,9, 5);
        AJucator mijlocas=fabrica.creeazaJucator(TipJucator.MIJLOCAS,"Ion Avramescu",false,3,6);
        AJucator atacant =fabrica.creeazaJucator(TipJucator.ATACANT,"Miron Costea",true,18,20);

        portar.descriereProfilJucator();
        fundas.descriereProfilJucator();;
        mijlocas.descriereProfilJucator();
        atacant.descriereProfilJucator();


    }
}
