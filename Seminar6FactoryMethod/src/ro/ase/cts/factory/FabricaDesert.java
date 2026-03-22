package ro.ase.cts.factory;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;

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