package farmacie;

public class Medicament {
    private String nume;

    public void cumparaMedicament(){
        System.out.println("Cumpar medicament "+nume+" de la farmacie");
    }

    public Medicament(String nume) {
        this.nume = nume;
    }
}