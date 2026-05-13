package clase;

public class VerificareTribuna implements VerificareSpectator {

    @Override
    public void verificareSpectator(Spectator spectator) {
        System.out.println("Verificare acces in tribuna: "+spectator.getNume()+
                ", va rugam sa permiteti controlul bagajului!");
    }
}
