package clase;

public class ClientFlyweight implements Flyweight {
    private String nume;
    private String cnp;
    private int nrAsigurare;

    protected ClientFlyweight(String nume, String cnp, int nrAsigurare) {
        this.nume = nume;
        this.cnp = cnp;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public void descriereReteta(DetaliiReteta detalii) {
        System.out.println("Clientul: " + this.nume + " cu CNP-ul: " + this.cnp + " si Asigurare nr. " + this.nrAsigurare);
        detalii.afiseazaDetaliiReteta();
    }
}