package main;

import clase.ConcreteInternare;
import clase.Internare;
import clase.Pacient;
import clase.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Petrescu Gabriel", 21, true);
        Pacient pacient2 = new Pacient("Radu Andrei", 60, false);

        Internare internare = new ConcreteInternare();
        Internare proxyInternare = new ProxyInternare(internare);

        proxyInternare.interneazaPacient(pacient1);
        proxyInternare.interneazaPacient(pacient2);
    }
}