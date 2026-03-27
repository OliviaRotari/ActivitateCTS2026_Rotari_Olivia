package ro.ase.cts.clase;

public abstract class ASupa {
    private String nume;
    public abstract String getTip();

    public abstract void afisareDetalii();

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
