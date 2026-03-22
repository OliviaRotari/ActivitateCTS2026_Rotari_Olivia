package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa  implements  FabricaFelDeMancare{

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return switch (tip){
            case TipSupa.SUPADELEGUME -> new SupaDeLegume(gramaj,pret);
            case TipSupa.SUPADEVITA -> new SupaDeVita(gramaj,pret);
            default -> null;
        };

    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int calorii, int gramaj, double pret) {
        return creareFelDeMancare(tip,gramaj,pret);
    }
}