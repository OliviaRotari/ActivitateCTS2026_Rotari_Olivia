package clase;

public class VerificareVip implements VerificareSpectator {
    @Override
    public void verificareSpectator(Spectator spectator) {
        System.out.println("Verificare acces in  zona VIP: "+spectator.getNume()+
                ", va rugam sa prezentati biletul!");

    }
}
