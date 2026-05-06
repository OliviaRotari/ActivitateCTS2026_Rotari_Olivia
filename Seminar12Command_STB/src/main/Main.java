package main;

import clase.Autobuz;
import clase.Command;
import clase.Operator;
import clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command comandaVolvo = new Plecare(new Autobuz("Volvo"), 235);
        Command comandaBMW = new Plecare(new Autobuz("BMW"), 105);

        operator.adaugaComanda(comandaVolvo);
        operator.adaugaComanda(comandaBMW);
        operator.adaugaComanda(new Plecare(new Autobuz("Mercedes"), 200));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}