package ro.ase.cts.clase;

public class SupaDeLegume extends  Supa{
    public SupaDeLegume(int gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume "+super.toString());
    }
}