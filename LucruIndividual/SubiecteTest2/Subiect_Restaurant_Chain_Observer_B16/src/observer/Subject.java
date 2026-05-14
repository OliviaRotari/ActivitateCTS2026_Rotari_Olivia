package observer;

public interface Subject {
    void trimiteNotificare(String mesaj);
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
}
