package ro.ase.cts.BrokerajSimpleFactory.program;

import ro.ase.cts.BrokerajSimpleFactory.clase.IAngajat;
import ro.ase.cts.BrokerajSimpleFactory.clase.Vanzator;
import ro.ase.cts.BrokerajSimpleFactory.factory.AngajatFactory;
import ro.ase.cts.BrokerajSimpleFactory.factory.TipAngajat;

public class TestFactory {
    public static void main(String[] args) {
        //creare Factory pentru angajati;
        AngajatFactory factory=new AngajatFactory();

        //creare angajat tip vanzator;
        IAngajat angajat1=factory.creareAngajat(TipAngajat.VANZATOR,"Popescu Cornel");
        IAngajat angajat2=factory.creareAngajat(TipAngajat.MANAGER,"Voivozeanu Alin");
        IAngajat angajat3=factory.creareAngajat(TipAngajat.ANALIST,"Ionescu Maria");

        System.out.println("Angajat de tip: "+angajat1.getTip());
        System.out.println("Angajat de tip: "+angajat2.getTip());
        System.out.println("Angajat de tip: "+angajat3.getTip());
    }
}
