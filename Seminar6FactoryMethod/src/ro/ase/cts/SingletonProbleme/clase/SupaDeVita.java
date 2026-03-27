package ro.ase.cts.SingletonProbleme.clase;

public class SupaDeVita extends Supa{
    public SupaDeVita(int gramaj, double pret) {
        super(gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita "+super.toString());
    }
}