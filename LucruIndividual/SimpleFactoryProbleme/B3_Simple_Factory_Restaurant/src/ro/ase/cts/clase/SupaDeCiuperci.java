package ro.ase.cts.clase;

public class SupaDeCiuperci extends ASupa{
    @Override
    public String getTip() {
        return "Supa de ciuperci";
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Se serveste "+getTip()+" - "+getNume());
    }
}
