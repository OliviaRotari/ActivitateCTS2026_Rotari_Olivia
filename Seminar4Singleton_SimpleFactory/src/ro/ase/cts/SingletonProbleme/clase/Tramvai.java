package ro.ase.cts.SingletonProbleme.clase;

public class Tramvai extends MijlocTransport {

    public Tramvai(String marca, int linie) {
        super(marca, linie);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Tramvaiul " + super.toString());
    }
}