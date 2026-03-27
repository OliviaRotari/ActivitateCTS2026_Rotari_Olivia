package ro.ase.cts.SingletonProbleme.program;

import ro.ase.cts.SingletonProbleme.clase.Bilet;
import ro.ase.cts.SingletonProbleme.fabrica.BiletFactory;
import ro.ase.cts.SingletonProbleme.fabrica.TipBilet;


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