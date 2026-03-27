package ro.ase.cts.clase;

public abstract class Medicament {
    private float pret;
    private String denumire;

    public Medicament(float pret, String denumire) {
        this.pret = pret;
        this.denumire = denumire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicamentul ");
        sb.append("pret=").append(pret).append(" RON");
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
