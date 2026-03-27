package ro.ase.cts.SingletonProbleme.factory;

import ro.ase.cts.SingletonProbleme.clase.Clatite;
import ro.ase.cts.SingletonProbleme.clase.FelDeMancare;
import ro.ase.cts.SingletonProbleme.clase.Papanasi;
import ro.ase.cts.SingletonProbleme.enums.TipDesert;
import ro.ase.cts.SingletonProbleme.enums.TipFelDeMancare;

public class FabricaDesert implements  FabricaFelDeMancare{
    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret) {

        return  creareFelDeMancare(tip,500,gramaj,pret);
    }

    @Override
    public FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int calorii, int gramaj, double pret) {
        return switch( tip){
            case TipDesert.PAPANASI -> new Papanasi(calorii,gramaj,pret);
            case TipDesert.CLATITE -> new Clatite(calorii,gramaj,pret);
            default -> null;
        };
    }
}