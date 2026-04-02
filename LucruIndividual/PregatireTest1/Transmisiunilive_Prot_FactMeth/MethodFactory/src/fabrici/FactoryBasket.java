package fabrici;

import CLASE.Basket;
import CLASE.Sport;

public class FactoryBasket implements FactorySport{
    @Override
    public Sport creeazaMeci(String echipaGazda, String echipaOaspete) {
        return new Basket(echipaGazda,echipaOaspete);
    }
}
