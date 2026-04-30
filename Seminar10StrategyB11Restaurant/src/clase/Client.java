package clase;

public class Client {
    private String nume;
    private ModalitatePlata modalitatePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitatePlata = new PlataCard();
    }

    public void setModalitatePlata(ModalitatePlata modalitatePlata) {
        this.modalitatePlata = modalitatePlata;
    }

    public void platesteTranzactie(double suma) {
        modalitatePlata.plateste(nume, suma);
    }
}
