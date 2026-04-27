package spital;

public class Medicament {
    private String numeMedicament;
    private float pretMedicament;

    public void achizitioneazaMedicament(){
        if(!this.prezintaReteta()){
            System.out.println("Pentru medicamentul cu numele "+numeMedicament+"nu exista medicament");
            return;
        }
        System.out.println("Achizitioneaz medicamentul "+numeMedicament+" la pretul: "+pretMedicament+" de la Spital");
    }

    public boolean prezintaReteta(){
        return numeMedicament.contains("reteta");
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public Medicament(String numeMedicament, float pretMedicament) {
        this.numeMedicament = numeMedicament;
        this.pretMedicament = pretMedicament;
    }
}