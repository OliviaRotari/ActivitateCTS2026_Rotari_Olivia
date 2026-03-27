package ro.ase.cts.CinemaSimpleFactory.program;

import ro.ase.cts.CinemaSimpleFactory.clase.Bilet;
import ro.ase.cts.CinemaSimpleFactory.fabrica.BiletFactory;
import ro.ase.cts.CinemaSimpleFactory.fabrica.TipBilet;


public class MainSimFactoryCinema {
    public static void main(String[] args) {
        BiletFactory fabrica = new BiletFactory();
        Bilet bilet;

        bilet = fabrica.createInstance(TipBilet.Student);
        bilet.descriere();
        bilet = fabrica.createInstance(TipBilet.Adult);
        bilet.descriere();
        bilet = fabrica.createInstance(TipBilet.Vip);
        bilet.descriere();


    }
}