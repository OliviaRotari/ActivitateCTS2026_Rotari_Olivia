package main;

import clase.PachetCazare;
import clase.PachetCazareTransport;
import clase.PachetTuristic;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetCazare = new PachetCazare(5);
        pachetCazare.vindePachet();

        PachetTuristic pachetCazTr = new PachetCazareTransport(23);
        pachetCazTr.vindePachet();

    }

}