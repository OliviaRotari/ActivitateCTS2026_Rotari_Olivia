package ro.ase.cts;

public class PersoanaSimulare implements IPersoanaSimulare{
    private String nume;
    private int varsta;
    private String cnp;

    public PersoanaSimulare() {
        this.nume="Miron Matei";
        this.varsta=22;
        this.cnp="98765433456789";
    }

    public PersoanaSimulare(String nume, int varsta, String cnp) {
        super();//atentie
        this.nume = nume;
        this.varsta = varsta;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Persoana simulare[nume="+nume+", varsta="+varsta+", cnp="+cnp+"]";
    }


    @Override
    public IPersoanaSimulare dublica() {
        try {
            return (IPersoanaSimulare) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
