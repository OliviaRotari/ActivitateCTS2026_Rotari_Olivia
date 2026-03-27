package ro.ase.cts.SingletonProbleme.fabrica;

import ro.ase.cts.SingletonProbleme.clase.Bilet;
import ro.ase.cts.SingletonProbleme.clase.BiletAdult;
import ro.ase.cts.SingletonProbleme.clase.BiletStudent;
import ro.ase.cts.SingletonProbleme.clase.BiletVip;

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