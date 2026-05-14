package observer;

import chain.NotificatorEmail;
import chain.NotificatorHandler;
import chain.NotificatorManager;
import chain.NotificatorSMS;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
    private List<Observer> clientiFideli;

    public Restaurant() {
        this.clientiFideli = new ArrayList<>();
    }


    @Override
    public void trimiteNotificare(String mesaj) {
        NotificatorHandler notificatorSMS = new NotificatorSMS();
        NotificatorHandler notificatorEmail = new NotificatorEmail();
        NotificatorHandler notificatorManager = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        for (Observer observer : clientiFideli) {
            notificatorSMS.notifica((Client) observer, mesaj);
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.clientiFideli.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.clientiFideli.remove(observer);
    }
}
