package main;

import clase.ComandaRezervare;
import clase.ComandaVanzare;
import clase.Command;
import clase.Operator;
import clase.PachetCazare;
import clase.PachetTuristic;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachet = new PachetCazare(29);

        Operator operator = new Operator();

        Command vanzare = new ComandaVanzare(pachet);
        Command rezervare = new ComandaRezervare(pachet);

        operator.invoca(rezervare);
        operator.invoca(vanzare);


    }

}