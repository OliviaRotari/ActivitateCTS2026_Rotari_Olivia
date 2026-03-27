package ro.ase.cts.CinemaSimpleFactory.factory;

import ro.ase.cts.CinemaSimpleFactory.clase.FelDeMancare;
import ro.ase.cts.CinemaSimpleFactory.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int gramaj, double pret);
    FelDeMancare creareFelDeMancare(TipFelDeMancare tip, int calorii, int gramaj, double pret);
}