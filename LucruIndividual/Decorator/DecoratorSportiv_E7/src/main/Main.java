package main;

import clase.BiletSimplu;
import clase.BiletSustinere;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet1 = new BiletSimplu("FCSB", "Dinamo");
        IBilet bilet2 = new BiletSimplu("Rapid", "Staeua Cluj");


        IBilet biletDecorat = new BiletSustinere(bilet1, "FCSB");
        biletDecorat.printeaza();
        System.out.println();

        IBilet bilet2Decorat = new BiletSustinere(bilet2, "FCSB");
        bilet2Decorat.printeaza();
    }
}
