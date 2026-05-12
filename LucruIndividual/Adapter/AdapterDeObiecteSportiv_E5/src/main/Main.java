package main;

import clase.AdapterBilet;
import clase.BiletRo;
import clase.IBilet;

public class Main {
    public static void main(String[] args) {
        BiletRo bilet = new BiletRo();
        IBilet adapter = new AdapterBilet(bilet);
        adapter.vindeBilet("Romania-Polonia", "10 mai 2026");
        adapter.rezervaBilet("Steaua-FCSB", "12 iunie 2026");

    }
}
