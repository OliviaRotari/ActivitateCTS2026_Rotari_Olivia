package ro.ase.cts.program;

import ro.ase.cts.clase.APersonal;
import ro.ase.cts.fabrici.*;

public class Program {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonalMedical=new FactoryPersonalMedical();
        FactoryPersonal factoryPersonalNonMedical=new FactoryPersonalNonMedical();

        APersonal registrator=factoryPersonalNonMedical.creeazaPersonal(TipPersonalNonMedical.REGISTRATOR,"Radu","Maria",3000,3,null);
        APersonal medic=factoryPersonalMedical.creeazaPersonal(TipPersonalMedical.MEDIC,"Petre","Gabriel",7000,3,"Logoped");

        registrator.descriereProfilAngajare();
        System.out.println("\n\n");
        medic.descriereProfilAngajare();
    }
}
