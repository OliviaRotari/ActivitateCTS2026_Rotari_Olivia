package ro.ase.cts.SingletonProbleme.clase;

public class Clatite extends  Desert{
    public Clatite(int calorii, int gramaj, double pret) {
        super(calorii, gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Clatite "+super.toString());
    }
}