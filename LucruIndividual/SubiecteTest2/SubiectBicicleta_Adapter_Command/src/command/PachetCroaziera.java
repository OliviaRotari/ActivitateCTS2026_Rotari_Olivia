package command;

import adapter.IPachetTuristic;

public class PachetCroaziera implements IPachetTuristic {
    private String numeCroaziera;

    public PachetCroaziera(String numeCroaziera) {
        this.numeCroaziera = numeCroaziera;
    }

    @Override
    public void descriePachet() {
        System.out.println("Pachetul croaziera pt destinatia "+numeCroaziera);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Croaziera pt: "+numeCroaziera+" a fost rezervata");
    }

    @Override
    public void vindePachet() {
        System.out.println("Croaziera pt: "+numeCroaziera+" a fost vanduta");
    }
}
