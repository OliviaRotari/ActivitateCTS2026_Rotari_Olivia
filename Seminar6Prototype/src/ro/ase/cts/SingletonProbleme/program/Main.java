package ro.ase.cts.SingletonProbleme.program;

import ro.ase.cts.SingletonProbleme.clase.PrototypeRezervare;
import ro.ase.cts.SingletonProbleme.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        PrototypeRezervare rezervare = new Rezervare("Nicolae", 5, "17:00", "0712356289");
        PrototypeRezervare rezervare2 = rezervare.copiaza();
        ((Rezervare) rezervare).setNrPersoane(4);
        ((Rezervare) rezervare).setOra("19:00");

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}