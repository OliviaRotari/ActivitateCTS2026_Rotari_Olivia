package main;

import observeri.ClientFidel;
import observeri.Observer;
import subiect.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer clientFidel1 = new ClientFidel("Petrescu Ion");
        Observer clientFidel2 = new ClientFidel("Georgescu Alex");
        Observer clientFidel3 = new ClientFidel("Ionescu Nicu");

        Restaurant restaurant = new Restaurant("LaMamaMare",
                "str Independentei 4");
        restaurant.adaugaObserver(clientFidel1);
        restaurant.adaugaObserver(clientFidel2);
        restaurant.adaugaObserver(clientFidel3);
        restaurant.trimiteNotificareOfertaNoua();

        System.out.println("\n\n");
        restaurant.stergeObserver(clientFidel1);
        restaurant.trimiteNotificareMeniuNou();
    }
}