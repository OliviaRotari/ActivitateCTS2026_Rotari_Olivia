package fabrici;

import CLASE.Handbal;
import CLASE.Sport;

public class FactoryHandbal implements FactorySport{
    @Override
    public Sport creeazaMeci(String echipaGazda, String echipaOaspete) {
        return new Handbal(echipaGazda,echipaOaspete);
    }
}
