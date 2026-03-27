package ro.ase.cts.CinemaSimpleFactory.factory;

import ro.ase.cts.CinemaSimpleFactory.clase.FelDeMancare;
import ro.ase.cts.CinemaSimpleFactory.clase.SupaDeLegume;
import ro.ase.cts.CinemaSimpleFactory.clase.SupaDeVita;
import ro.ase.cts.CinemaSimpleFactory.enums.TipFelDeMancare;
import ro.ase.cts.CinemaSimpleFactory.enums.TipSupa;

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