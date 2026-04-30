import spital.Medicament;
import spital.MedicamentAdapter;


public class Main {
    private static void procuraMedicament(farmacie.Medicament medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament medicamentSpital=new Medicament( "Nurofen reteta",34.6f);
        farmacie.Medicament medicamentFarmacie=new farmacie.Medicament("Paracetamol");
        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
        System.out.println("\n");
        procuraMedicament(medicamentFarmacie);
        //   procuraMedicament(medicamentSpital); -verificam si facem dupa adapter de obiecte,deoarece  avem 2 clase concrete
        MedicamentAdapter medicamentAdaptat =new MedicamentAdapter(medicamentSpital);
        procuraMedicament(medicamentAdaptat);
    }
}