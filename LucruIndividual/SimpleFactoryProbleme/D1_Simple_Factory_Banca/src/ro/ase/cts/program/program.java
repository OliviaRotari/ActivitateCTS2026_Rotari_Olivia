package ro.ase.cts.program;

import ro.ase.cts.clase.ACredit;
import ro.ase.cts.fabrica.FabricaCredite;
import ro.ase.cts.fabrica.TipCredit;

public class program {
    public static void main(String[] args) {
        FabricaCredite fabrica = new FabricaCredite();

        ACredit credit1= fabrica.crereCredit(TipCredit.IPOTECAR,"Marin Petrescu");
        ACredit credit2=fabrica.crereCredit(TipCredit.NEVOI_PERSONALE,"Mihaela Pavalache");

        credit1.afisare();
        credit2.afisare();

        System.out.println("\nAcesta credit este de tip: "+credit1.getTip());
        System.out.println("\nAcesta credit este de tip: "+credit2.getTip());
    }
}
