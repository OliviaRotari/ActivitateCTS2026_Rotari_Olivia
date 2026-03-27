package ro.ase.cts.SingletonProbleme.clase;

public class Troleibuz extends MijlocTransport {

    public Troleibuz(String marca, int linie) {
        super(marca, linie);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Troleibuzul " + super.toString());
    }
}