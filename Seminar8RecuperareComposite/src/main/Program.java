package main;

import clase.Departament;
import clase.Sectie;
import clase.Structura;

public class Program {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administratie");
        Structura sectieSecretariat = new Sectie("Secretariat", 20);
        Structura sectieManagement = new Sectie("Management", 30);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament) depSpital).stergeStructura((sectieManagement));
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);
        depSpital.afiseazaDetaliiStructura("");
    }
}