package program;

import clase.PachetCazare;
import clase.PachetTuristic;
import decorator.OfertaPachetCazare;
import decorator.OfertaPachetTuristic;

public class Program {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("Acest pachet nu poate fi anulat");
        System.out.println();


        OfertaPachetTuristic pachetTuristicOferta = new OfertaPachetCazare(pachetTuristic);
        pachetTuristicOferta.descriere();
        System.out.println("Acest pachet poate fi anulat");
        pachetTuristicOferta.anulareRezervare();
    }

}
