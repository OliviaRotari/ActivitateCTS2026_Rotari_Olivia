package main;


import clase.Client;
import clase.PlataCash;

public class TestareStrategy {
    public static void main(String[] args) {
        Client client1 = new Client("Maria");
        client1.platesteTranzactie(200);
        client1.setModalitatePlata(new PlataCash());
        client1.platesteTranzactie(150);
    }
}
