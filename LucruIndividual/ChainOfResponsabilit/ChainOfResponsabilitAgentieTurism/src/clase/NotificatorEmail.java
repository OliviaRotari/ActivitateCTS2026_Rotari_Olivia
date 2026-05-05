package clase;

public class NotificatorEmail extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if (client.getAdresaMail() != null)
            System.out.println(client.getNume() + " ai un E-Mail cu mesajul " + mesaj);
        else
            super.getUrmatorulNotificator().notifica(client, mesaj);
    }
}