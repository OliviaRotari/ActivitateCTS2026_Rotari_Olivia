package main;

import clase.Client;
import clase.Notificator;
import clase.NotificatorEmail;
import clase.NotificatorManager;
import clase.NotificatorSMS;

public class Main {

    public static void main(String[] args) {
        Notificator notificatorSMS=new NotificatorSMS();
        Notificator notificatorEmail=new NotificatorEmail();
        Notificator notificatorManager=new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client=new Client("Popescu", null, null);

        notificatorSMS.notifica(client, "Notificare TEST");
    }

}