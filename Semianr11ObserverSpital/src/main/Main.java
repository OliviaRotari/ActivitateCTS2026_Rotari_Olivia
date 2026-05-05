package main;

import clase.ISpital;
import clase.Pacient;
import clase.PacientAbonat;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Rotari", 24);
        Pacient pacient2 = new PacientAbonat("Vasilescu", 20);
        Pacient pacient3 = new PacientAbonat("Popescu", 26);

        ISpital spital = new Spital("Floreasca");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital) spital).notificareVirus();
        System.out.println("---------------------------------");
        ((Spital) spital).notificareEpidemie();
    }
}