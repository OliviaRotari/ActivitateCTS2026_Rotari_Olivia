package main;

import clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ModPlata plataCard = new PlataCard();
        ModPlata plataCash = new PlataCash();

        Medicament m1 = new Medicament("Paracetamol", 29.5f);
        Medicament m2 = new Medicament("Mentol", 18f);
        Medicament m3 = new Medicament("SpasmaDen", 20f);
        Medicament m4 = new Medicament("GelForte", 9.9f);
        Medicament m5 = new Medicament("MuscleFort", 12.4f);

        Client client = new Client("Gabriela Popescu", List.of(m1, m2));

        client.setModPlata(plataCard);
        client.plateste();
        System.out.println();

        client.setReteta(List.of(m3, m4, m5));
        client.setModPlata(plataCash);
        client.plateste();
    }
}