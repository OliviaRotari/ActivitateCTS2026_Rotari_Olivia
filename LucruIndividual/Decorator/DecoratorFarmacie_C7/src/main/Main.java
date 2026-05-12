package main;

import clase.BonCuFelicitare;
import clase.BonDeCasa;
import clase.IBon;

public class Main {
    public static void main(String[] args) {
        BonDeCasa bon = new BonDeCasa(1, 101.4);
        BonDeCasa bon2 = new BonDeCasa(2, 45.7);

        IBon bonDecorat = new BonCuFelicitare(bon);
        bonDecorat.printeazBon();
        IBon bonDecorat2 = new BonCuFelicitare(bon2);
        bonDecorat2.printeazBon();
    }
}
