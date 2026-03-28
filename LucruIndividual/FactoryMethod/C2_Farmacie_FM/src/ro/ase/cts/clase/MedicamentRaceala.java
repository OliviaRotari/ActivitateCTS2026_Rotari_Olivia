package ro.ase.cts.clase;

public class MedicamentRaceala extends Medicament{

    public MedicamentRaceala(float pret, String denumire) {
        super(pret, denumire);
    }
    @Override
    public String toString() {
        return super.toString()+"\n Tip medicament:RACEALA";
    }
}
