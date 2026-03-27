package ro.ase.cts.SingletonProbleme.clase;

public abstract class MijlocTransport {
    private String marca;
    private int linie;

    public MijlocTransport(String marca, int linie) {
        this.marca = marca;
        this.linie = linie;
    }

    public abstract void afisareDescriere();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("marca=").append(marca);
        sb.append(", linie=").append(linie);
        sb.append(";");
        return sb.toString();

    }
}