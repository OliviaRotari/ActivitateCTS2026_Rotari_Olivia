package ro.ase.cts.program;

import ro.ase.cts.clase.ASupa;
import ro.ase.cts.factory.SupaFactory;
import ro.ase.cts.factory.TipSupa;

public class TestRestaurantSimpleFactor {
    public static void main(String[] args) {
        SupaFactory fabrica=new SupaFactory();
        ASupa supa=fabrica.creareSupa(TipSupa.LEGUME,"Supa de rosii");
        ASupa supa1=fabrica.creareSupa(TipSupa.VITA,"Ciorba de vacuta");
        ASupa supa2= fabrica.creareSupa(TipSupa.CIUPERCI,"Supa crema de ciuperci");

        //afisare;
        supa.afisareDetalii();
        supa1.afisareDetalii();
        supa2.afisareDetalii();

        System.out.println("\nTip obiect 1: " + supa.getTip());
        System.out.println("\nTip obiect 2: "+supa1.getTip());
        System.out.println("\nTip obiect 3: "+supa2.getTip());

    }
}
