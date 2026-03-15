package ro.ase.cts.program;

import ro.ase.cts.clase.Bilet;
import ro.ase.cts.fabrica.BiletFactory;
import ro.ase.cts.fabrica.TipBilet;


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