package main;

import clase.BiletSTB;
import clase.BiletSarbatoare;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        IBilet bilet = new BiletSTB(10);
        IBilet biletDecorat = new BiletSarbatoare(bilet, "1 decembrie-Ziua Romaniei");
        biletDecorat.descriereBilet();
        IBilet bilet2 = new BiletSTB(5);
        IBilet biletDecorat2 = new BiletSarbatoare(bilet2, "1 ianuarie-Anul nou");
        biletDecorat2.descriereBilet();
    }
}

