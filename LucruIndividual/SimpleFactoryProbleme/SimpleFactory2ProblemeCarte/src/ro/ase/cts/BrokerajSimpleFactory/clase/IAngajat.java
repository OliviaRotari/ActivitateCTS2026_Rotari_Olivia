package ro.ase.cts.BrokerajSimpleFactory.clase;

public abstract class IAngajat{
    //atribute
    private String nume;
    //metode absttracte
    public abstract String getTip();
    public abstract void afisare(String nume);

    //metode
    public void setNume(String nume){
        this.nume=nume;
    }
}
