package main;

import observer.Client;
import observer.Observer;
import observer.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Client client1 = new Client("Popa Luminita", "popa.luminita@gmail.com", "0733111009");
        Client client2 = new Client("Toma Eugen", null, "0799288780");
        Client client4 = new Client("Ionela Petre", "ionele@gmail.com", null);
        Client client3 = new Client("Petre Mariana", null, null);

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);
        restaurant.adaugaObserver(client3);
        restaurant.adaugaObserver(client4);

        restaurant.trimiteNotificare("Avem o noua pizza in meniu! Consultati catalogul nostru pentru detalii!");
        System.out.println("\n\n");
        restaurant.stergeObserver(client1);
        restaurant.trimiteNotificare("Am inchis");
    }
}
