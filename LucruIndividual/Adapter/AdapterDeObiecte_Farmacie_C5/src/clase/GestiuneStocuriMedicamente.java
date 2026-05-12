package clase;


public class GestiuneStocuriMedicamente {
    private Farmacie farmacie;

    public GestiuneStocuriMedicamente(Farmacie farmacie) {
        this.farmacie = farmacie;
    }

    public boolean verificaStocPentruMedicament(int id, int cantitateDorita) {
        return this.farmacie.verificaStoc(id, cantitateDorita);
    }

    public Farmacie getFarmacie() {
        return farmacie;
    }
}