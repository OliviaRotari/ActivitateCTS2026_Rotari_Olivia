package command;

import adapter.IPachetTuristic;

public class ComandaRezervare implements ICommand{
    private IPachetTuristic pachetTuristic;

    public ComandaRezervare(IPachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }


    @Override
    public void executa() {
        pachetTuristic.rezervaPachet();
    }
}
