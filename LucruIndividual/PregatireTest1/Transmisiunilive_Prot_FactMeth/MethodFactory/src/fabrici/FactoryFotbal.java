package fabrici;

import CLASE.Fotban;
import CLASE.Sport;

public class FactoryFotbal implements FactorySport{
    @Override
    public Sport creeazaMeci(String echipaGazda, String echipaOaspete) {
        return new Fotban(echipaGazda,echipaOaspete);
    }
}
