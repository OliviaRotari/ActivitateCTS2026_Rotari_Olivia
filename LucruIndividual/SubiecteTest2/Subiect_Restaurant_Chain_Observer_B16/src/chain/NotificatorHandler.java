package chain;

import observer.Client;

public abstract class NotificatorHandler {
private NotificatorHandler succesor;

    public NotificatorHandler getSuccesor() {
        return succesor;
    }

    public void setSuccesor(NotificatorHandler succesor) {
        this.succesor = succesor;
    }

    public abstract  void notifica(Client client, String mesaj);
}
