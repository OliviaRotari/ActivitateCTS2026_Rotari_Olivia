package clase;

public class Student {
    private ModSustinere modSustinere;
    private String nume;

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere = new ProbaGrila();
    }

    public void setModSustinere(ModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void verificare() {
        modSustinere.daExamen();
    }
}