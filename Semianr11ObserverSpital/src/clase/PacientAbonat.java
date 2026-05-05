package clase;

public class PacientAbonat implements Pacient {
    private String nume;
    private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptionareNotificare(String mesaj) {
        System.out.println("Pacientul " + this.nume + " cu varsta " + varsta + " a primit notificarea: " + mesaj);
    }
}