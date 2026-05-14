package chain;

import observer.Client;

public class NotificatorManager extends NotificatorHandler{
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Clientul "+client.getNume()+" nu are date de conact! ");
    }
}
