package main;

import clase.CompositeSectiune;
import clase.IComponentaGrupare;
import clase.Medicament;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IComponentaGrupare medicament1=new Medicament("Paracetamol",26f);
        IComponentaGrupare medicament2 = new Medicament("Sindolor", 35.75f);
        IComponentaGrupare medicament3 = new Medicament("Dolorgit", 40f);
        IComponentaGrupare medicament4 = new Medicament("Panadol adulti", 30f);

        IComponentaGrupare medicament5 = new Medicament("Panadol Baby", 35.5f);
        IComponentaGrupare medicament6 = new Medicament("Calgel", 26f);

        IComponentaGrupare medicament7 = new Medicament("TheraFlu", 49.5f);
        IComponentaGrupare medicament8 = new Medicament("Coldrex", 27f);
        IComponentaGrupare medicament9 = new Medicament("Strepsils", 30f);

        IComponentaGrupare medicament10 = new Medicament("Ospen", 45.5f);
        IComponentaGrupare medicament11 = new Medicament("Amoxicilina", 36f);

        IComponentaGrupare sectiuneRaceala=new CompositeSectiune("Raceala ");
        IComponentaGrupare sectiuneDurere=new CompositeSectiune("Durere");
        IComponentaGrupare sectiuneAntibiotice=new CompositeSectiune("Antibiotice");

        IComponentaGrupare copii=new CompositeSectiune("Copii");
        IComponentaGrupare adulti=new CompositeSectiune("Adulti");

        IComponentaGrupare farmacie=new CompositeSectiune("Farmacia Tei");

        sectiuneRaceala.adaugaComponenta(medicament7);
        sectiuneRaceala.adaugaComponenta(medicament8);
        sectiuneRaceala.adaugaComponenta(medicament9);

        adulti.adaugaComponenta(medicament1);
        adulti.adaugaComponenta(medicament2);
        adulti.adaugaComponenta(medicament3);
        adulti.adaugaComponenta(medicament4);

        copii.adaugaComponenta(medicament5);
        copii.adaugaComponenta(medicament6);

        sectiuneDurere.adaugaComponenta(adulti);
        sectiuneDurere.adaugaComponenta(copii);

        sectiuneAntibiotice.adaugaComponenta(medicament10);
        sectiuneAntibiotice.adaugaComponenta(medicament11);

        /*  farmacie.adaugaComponenta(sectiuneRaceala);
      farmacie.adaugaComponenta(sectiuneAntibiotice);
      farmacie.adaugaComponenta(sectiuneDurere);

      farmacie.descrieComponenta("\t");
*/


List<IComponentaGrupare> arbore=new ArrayList<>(Arrays.asList(sectiuneRaceala,sectiuneDurere,sectiuneAntibiotice));

for(IComponentaGrupare componenta:arbore){
    componenta.descrieComponenta("\t");
}

    }
}
