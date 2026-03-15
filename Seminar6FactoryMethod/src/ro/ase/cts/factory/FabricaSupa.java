package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare {
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {
        return switch (tip) {
            case TipSupa.SupaDeLegume -> new SupaDeLegume(gramaj, pret);
            case TipSupa.SupaDeVita -> new SupaDeVita(gramaj, pret);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii) {
        return creareFelDeMancare(tip, gramaj, pret);
    }
}