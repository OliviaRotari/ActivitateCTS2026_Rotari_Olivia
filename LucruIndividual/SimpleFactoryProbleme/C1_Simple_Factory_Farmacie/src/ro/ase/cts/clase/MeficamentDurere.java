package ro.ase.cts.clase;

import java.util.StringJoiner;

public class MeficamentDurere extends Medicament {
    public MeficamentDurere(float pret, String denumire) {
        super(pret, denumire);
    }

    @Override
    public String toString() {
        return super.toString() + "\nTip medicament: DURERE";
    }
}
