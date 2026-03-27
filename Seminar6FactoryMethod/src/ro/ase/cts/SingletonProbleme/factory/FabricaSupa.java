package ro.ase.cts.SingletonProbleme.factory;

import ro.ase.cts.SingletonProbleme.clase.FelDeMancare;
import ro.ase.cts.SingletonProbleme.clase.SupaDeLegume;
import ro.ase.cts.SingletonProbleme.clase.SupaDeVita;
import ro.ase.cts.SingletonProbleme.enums.TipFelDeMancare;
import ro.ase.cts.SingletonProbleme.enums.TipSupa;

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