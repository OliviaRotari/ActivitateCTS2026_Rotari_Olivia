package fabrici;

import clase.*;

public class FabricaBiciclete {
    public Bicicleta creeazaBicicleta(TipBicicleta tipBicicleta, float diametruRoti, float pret, TipFrana tipFrana,
                                       boolean areCascaProtectie, boolean areOchelari, boolean areCotiere,
                                       boolean areGenunchiere) throws Exception {
            switch (tipBicicleta) {
                case ELECTRICA:
                    new BicicletaMTB(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
                case MTB:
                    return new BicicletaElectrica(diametruRoti, pret, tipFrana, areCascaProtectie, areOchelari, areCotiere, areGenunchiere);
                default:
                    return null;
            }
    }
}
