package ro.ase.cts.clase;

public class Papanasi extends Desert {
    public Papanasi(int calorii, double pret, int gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Papanasi: " + super.toString());
    }
}