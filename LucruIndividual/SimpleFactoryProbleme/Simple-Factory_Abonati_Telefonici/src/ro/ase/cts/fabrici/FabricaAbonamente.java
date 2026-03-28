package ro.ase.cts.fabrici;

import ro.ase.cts.clase.ISubscription;
import ro.ase.cts.clase.MobilityX;
import ro.ase.cts.clase.MobilityY;
import ro.ase.cts.clase.MobilityZ;

public class FabricaAbonamente {
    public ISubscription creeazaAbonament(TipAbonament tipAbonament, double pretPeLuna){
     return switch (tipAbonament){
         case MOBILITY_X -> new MobilityY(pretPeLuna);
         case MOBILITY_Y -> new MobilityY(pretPeLuna);
         case MOBILITY_Z -> new MobilityZ(pretPeLuna);
         default -> null;
     };
    }
}
