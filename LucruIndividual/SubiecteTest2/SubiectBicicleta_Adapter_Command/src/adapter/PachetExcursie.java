package adapter;

public class PachetExcursie implements IPachetTuristic{
    private String destinatie;

    public PachetExcursie(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public void descriePachet() {
        System.out.println("Pachetul excursie pt destinatia "+destinatie);
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Excursia pt: "+destinatie+" a fost rezervata");
    }

    @Override
    public void vindePachet() {
        System.out.println("Excursia pt: "+destinatie+" a fost vanduta");
    }
}
