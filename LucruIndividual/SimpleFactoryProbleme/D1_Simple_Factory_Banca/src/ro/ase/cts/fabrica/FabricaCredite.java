package ro.ase.cts.fabrica;

import ro.ase.cts.clase.ACredit;
import ro.ase.cts.clase.CreditIpotecar;
import ro.ase.cts.clase.CreditNevoiPersonale;

public class FabricaCredite {
    public ACredit crereCredit(TipCredit tipCredit, String beneficiar) {
        ACredit credit = null;

        switch (tipCredit) {
            case IPOTECAR:
                credit = new CreditIpotecar();
                credit.setBeneficiar(beneficiar);
                break;
            case NEVOI_PERSONALE:
                credit = new CreditNevoiPersonale();
                credit.setBeneficiar(beneficiar);
                break;
        }
        return credit;
    }
}
