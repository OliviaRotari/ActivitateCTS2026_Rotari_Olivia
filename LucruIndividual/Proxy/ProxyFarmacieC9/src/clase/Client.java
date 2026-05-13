package clase;

public class Client {
    protected String nume;
    protected boolean areReteta;

    public Client(String nume, boolean areReteta) {
        this.nume = nume;
        this.areReteta = areReteta;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }
}
