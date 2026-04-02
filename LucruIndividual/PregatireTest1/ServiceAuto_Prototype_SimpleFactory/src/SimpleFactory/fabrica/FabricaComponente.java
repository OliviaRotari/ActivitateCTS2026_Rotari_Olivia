package SimpleFactory.fabrica;

import SimpleFactory.clase.Capota;
import SimpleFactory.clase.IComponenta;
import SimpleFactory.clase.Usa;

public class FabricaComponente {
    public IComponenta creeazaComponenta(TipComponenta tipComponenta)  {
        switch (tipComponenta) {
            case USA:
                return new Usa();
            case CAPOTA:
                return new Capota();
            default:
                return null;
        }
    }
}
