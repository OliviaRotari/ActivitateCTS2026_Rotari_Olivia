package clase;

import client.Observer;

public interface Subiect {
    void adaugaObserver(Observer observer);

    void stergeObserver(Observer observer);

    void trimiteNotificare(String mesaj);
}