package main;

import CLASE.Fotban;
import CLASE.Sport;
import fabrici.FactoryBasket;
import fabrici.FactoryFotbal;
import fabrici.FactoryHandbal;
import fabrici.FactorySport;

public class Main {
    public static void main(String[] args) {
        FactorySport fotbal = new FactoryFotbal();
        FactorySport handbal = new FactoryHandbal();
        FactorySport baschet = new FactoryBasket();

        Sport meciFotbal = fotbal.creeazaMeci("FCSB", "Farul Constanta");
        Sport meciHandbal = handbal.creeazaMeci("CSM Unirea", "Rapid Bucuresti");
        Sport meciBaschet = baschet.creeazaMeci("Vulturii", "Soimii");

        meciHandbal.detaliiMeci();
        meciFotbal.detaliiMeci();
        meciBaschet.detaliiMeci();
    }
}
