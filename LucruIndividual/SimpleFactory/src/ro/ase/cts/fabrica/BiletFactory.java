package ro.ase.cts.fabrica;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.clase.BiletAdult;
import ro.ase.cts.clase.BiletStudent;
import ro.ase.cts.clase.BiletVip;

public class BiletFactory {
    public Bilet createInstance(TipBilet tip) {
        switch (tip) {
            case Adult:
                return new BiletAdult();
            case Student:
                return new BiletStudent();
            case Vip:
                return new BiletVip();
            default:
                return null;
        }
    }
}