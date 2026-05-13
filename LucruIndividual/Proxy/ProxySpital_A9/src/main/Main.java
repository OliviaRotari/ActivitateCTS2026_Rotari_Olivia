package main;

import clasa.ConcreteInternare;
import clasa.Internare;
import clasa.Pacient;
import clasa.ProxyInternare;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Ionela Ion", 23, true);
        Pacient p2 = new Pacient("Petre Marin", 65, false);

        Internare internare = new ConcreteInternare();
        Internare proxyInternare = new ProxyInternare(internare);

        proxyInternare.interneazaPacient(p1);
        proxyInternare.interneazaPacient(p2);
    }
}
