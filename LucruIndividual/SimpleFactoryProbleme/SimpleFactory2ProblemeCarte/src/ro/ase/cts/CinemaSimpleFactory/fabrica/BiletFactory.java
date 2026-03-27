package ro.ase.cts.CinemaSimpleFactory.fabrica;

import ro.ase.cts.CinemaSimpleFactory.clase.Bilet;
import ro.ase.cts.CinemaSimpleFactory.clase.BiletAdult;
import ro.ase.cts.CinemaSimpleFactory.clase.BiletStudent;
import ro.ase.cts.CinemaSimpleFactory.clase.BiletVip;

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