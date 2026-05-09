package subiect;

import observeri.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect {
    private String nume;
    private String adresa;
    private List<Observer> clientiFideli;

    public Restaurant(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.clientiFideli = new ArrayList<Observer>();
    }


    @Override
    public void adaugaObserver(Observer observer) {
        this.clientiFideli.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.clientiFideli.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : this.clientiFideli) {
            observer.receptionareMesaj("Restaurant " + this.nume + " - "
                    + this.adresa + ":\n\t " + mesaj);
        }
    }

    public void trimiteNotificareOfertaNoua() {
        trimiteNotificare("A fost adaugata o noua oferta! Consultati catalogul actualizat ptdetalii!");
    }

    public void trimiteNotificareMeniuNou() {
        trimiteNotificare("Ne-am actualizat meniul cu noi preparate! Consultati catalogul pt detalii!");
    }
}