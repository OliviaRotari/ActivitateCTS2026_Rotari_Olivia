package clase;

public class SpectatorPeluza implements VerificareSpectator{

    @Override
    public void verificareSpectator(Spectator spectator) {
        System.out.println("Verificare acces in peluza: "+spectator.getNume()+
                ", va rugam sa permiteti controlul bagajului si a hainelor purtate!");
    }
}
