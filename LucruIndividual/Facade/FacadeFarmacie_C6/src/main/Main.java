package main;

import clase.Client;
import clase.FacadeFarmacie;
import clase.Medicament;
import clase.Reteta;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Medicament m1=new Medicament("Paracetamol",15.5f,2);
        Medicament m2 = new Medicament("Vitamina C", 20f, 1);
        Medicament m3 = new Medicament("Coldrex", 27.5f, 3);

        Reteta r1=new Reteta(List.of(m1,m2,m3));
        Reteta r2=new Reteta(List.of(m1,m2));

        Client c1=new Client("Olivia",true);
        FacadeFarmacie facade=new FacadeFarmacie(r1,c1);
        facade.achizitioneazaReteta();
        System.out.println();

        facade.setReteta(r2);
        facade.achizitioneazaReteta();

    }
}
