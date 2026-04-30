package spital;

import farmacie.Medicament;

public class MedicamentAdapter extends Medicament {


    private spital.Medicament medicamentSpital;


    public MedicamentAdapter( spital.Medicament medicamentSpital) {
        super(medicamentSpital.getNumeMedicament());
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}