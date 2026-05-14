package chain;

import observer.Client;

public class NotificatorSMS extends NotificatorHandler{
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getTelefon()!=null){
            client.primesteSMS(mesaj);
        }else{
            this.getSuccesor().notifica(client,mesaj);
        }
    }
}
