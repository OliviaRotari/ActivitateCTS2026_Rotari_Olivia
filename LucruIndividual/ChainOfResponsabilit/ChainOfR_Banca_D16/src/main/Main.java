package main;

import clase.ContCredit;
import clase.ContDebit;
import clase.ContEconomii;
import clase.HandlerPlata;

public class Main {
    public static void main(String[] args) {
        HandlerPlata contDebit = new ContDebit(200);
        HandlerPlata contEconomii = new ContEconomii(300);
        HandlerPlata contCredit = new ContCredit(600);

        contDebit.setSuccesor(contEconomii);
        contEconomii.setSuccesor(contCredit);

        contDebit.gestioneazaPlata(100);
        System.out.println();
        contDebit.gestioneazaPlata(110);
        System.out.println();
        contDebit.gestioneazaPlata(400);
        System.out.println();
        contDebit.gestioneazaPlata(900);


    }
}