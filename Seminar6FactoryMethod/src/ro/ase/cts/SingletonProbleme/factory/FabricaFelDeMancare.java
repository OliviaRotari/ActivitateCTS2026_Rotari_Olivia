package ro.ase.cts.SingletonProbleme.factory;

import ro.ase.cts.SingletonProbleme.clase.FelDeMancare;
import ro.ase.cts.SingletonProbleme.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int calorii, int gramaj, double pret);
}