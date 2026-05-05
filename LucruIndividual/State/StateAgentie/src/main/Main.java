package main;

import clase.Rezervare;
import clase.StareNeplatita;
import clase.StarePlatita;

public class Main {

    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1000);

        StareNeplatita neplatita = new StareNeplatita();
        neplatita.doAction(rezervare);

        StarePlatita platita = new StarePlatita();
        platita.doAction(rezervare);

    }

}