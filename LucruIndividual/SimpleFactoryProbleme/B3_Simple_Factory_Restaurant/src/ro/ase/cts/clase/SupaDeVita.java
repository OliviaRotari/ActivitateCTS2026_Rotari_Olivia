package ro.ase.cts.clase;

public class SupaDeVita extends ASupa {
    @Override
    public String getTip() {
        return "Supa de vita";
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Se serveste " + getTip() + "  - " + getNume());
    }
}
