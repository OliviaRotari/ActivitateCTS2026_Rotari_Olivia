package main;

import clase.FacadeAccesStadion;
import clase.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana1=new Persoana("Mihaela Ion","SDFGHJH",true,false);
        Persoana persoana2 = new Persoana("Mihalache Diana", "XY902",
                false, false);
        Persoana  persoana3 = new Persoana("Georgescu Ionela", "BZ123",
                false, true);
        Persoana persoana4 = new Persoana("Petrescu Gabriel", "SZ112",
                true, true);
        Persoana persoana5 = new Persoana("Petrescu Marin", "jhgfd",
                true, true);

        FacadeAccesStadion facade=new FacadeAccesStadion();
        facade.setPersoana(persoana1);
        facade.permisiuneAccesIntrare(persoana1.getSerieBuletin(), "Bilet1");

        facade.setPersoana(persoana2);
        facade.permisiuneAccesIntrare(persoana2.getSerieBuletin(), "Bilet2");

        facade.setPersoana(persoana3);
        facade.permisiuneAccesIntrare(persoana3.getSerieBuletin(), "Bilet3");

        facade.setPersoana(persoana4);
        facade.permisiuneAccesIntrare("Serie_necunoscuta", "Bilet4");
        facade.setPersoana(persoana5);
        facade.permisiuneAccesIntrare(persoana5.getSerieBuletin(), "Bilet5");

    }
}
