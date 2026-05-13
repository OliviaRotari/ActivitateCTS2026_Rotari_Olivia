package clase;

public class Medicament implements IComponentaGrupare {
    private String denumire;
    private double pret;

    public Medicament(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    public void descrieComponenta(String aliniat) {
        System.out.println(aliniat + this.denumire + " - " + this.pret + " RON");    }

    @Override
    public void adaugaComponenta(IComponentaGrupare componenta) {
        throw new RuntimeException("Aceasta permisiune nu este permisa");
    }

    @Override
    public void stergeComponenta(IComponentaGrupare componenta) {
        throw new RuntimeException("Aceasta permisiune nu este permisa");
    }
}
