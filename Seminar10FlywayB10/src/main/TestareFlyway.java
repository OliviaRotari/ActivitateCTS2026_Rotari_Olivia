package main;

import clase.Client;
import clase.ClientAbstract;
import clase.RegistruClienti;
import clase.Rezervare;

public class TestareFlyway {
    public static void main(String[] args) {
        RegistruClienti registru = new RegistruClienti();
        ClientAbstract client1 = registru.getClient("Ana", "098765435", "ana@mail.com");
        ClientAbstract client2 = registru.getClient("Bogdan", "023456773", "bogdan@gmail.com");
        Rezervare rezervare1 = new Rezervare(12, "17:50", 2);
        client1.printeazaRezervare(rezervare1);
        Rezervare rezervare2 = new Rezervare(13, "12:50", 20);
        client1.printeazaRezervare(rezervare2);
        registru.getClient("Andrei", "023456773", "andrei@gamil.com").printeazaRezervare(rezervare2);
        registru.getClient("Andrei", "023456773", "andrei@gamil.com").plateste(rezervare2, 100.50);
        Rezervare rezervare3 = new Rezervare(17, "20:00", 5);
        registru.getClient("Ana", "098765435", "ana@mail.com").printeazaRezervare(rezervare3);
        registru.getClient("Ana", "098765435", "ana@mail.com").plateste(rezervare3, 99.00);
    }
}
