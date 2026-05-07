package main;

import clase.IRaportAnalize;
import clase.RaportPrintat;
import clase.RaportOnline;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> analize = new HashMap<>();
        analize.put("Colesterol", 101.0);
        analize.put("Vitamina E", 23.7);
        analize.put("Magneziu", 150.2);

        IRaportAnalize raportPrintat = new RaportPrintat("Petrescu Ion",
                "06/05/2026", analize);
        IRaportAnalize raportOnline = new RaportOnline(raportPrintat);
        raportOnline.livreazaRaport();
    }
}
