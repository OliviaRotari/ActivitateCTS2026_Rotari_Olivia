package command;

import adapter.IPachetTuristic;

public class CommandVanzare implements ICommand {
    private IPachetTuristic pachetTuristic;

    public CommandVanzare(IPachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executa() {
        pachetTuristic.vindePachet();
    }
}
