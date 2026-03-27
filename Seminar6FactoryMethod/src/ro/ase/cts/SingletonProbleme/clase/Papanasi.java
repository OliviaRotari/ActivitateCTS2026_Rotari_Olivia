package ro.ase.cts.SingletonProbleme.clase;

public class Papanasi  extends Desert{
    public Papanasi(int calorii, int gramaj, double pret) {
        super(calorii, gramaj, pret);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Papanasi "+super.toString());
    }
}