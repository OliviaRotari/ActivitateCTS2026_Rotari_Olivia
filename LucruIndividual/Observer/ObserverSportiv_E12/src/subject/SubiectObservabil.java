package subject;

import observer.Observer;

public interface SubiectObservabil {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void notificaOberver(Meci meci);
}
