package chain;

import observer.Client;

public class NotificatorEmail extends NotificatorHandler{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getEmail()!=null){
            client.primesteEmail(mesaj);
        }else{
            this.getSuccesor().notifica(client,mesaj);
        }
    }
}
