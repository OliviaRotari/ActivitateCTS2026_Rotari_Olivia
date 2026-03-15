package ro.ase.cts.factory;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);

    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret, int nrCalorii);
}