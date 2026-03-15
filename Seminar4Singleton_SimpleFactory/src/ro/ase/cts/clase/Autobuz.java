package ro.ase.cts.clase;

public class Autobuz extends  MijlocTransport {

    public Autobuz(String marca, int linie) {
        super(marca, linie);
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Autobuzul "+super.toString());
    }
}