package clase;

public class Persoana {
    protected String nume;
    protected String serieBuletin;
    protected boolean esteCautatDePolitie;
    protected boolean areAntecedente;

    public Persoana(String nume, String serieBuletin, boolean esteCautatDePolitie, boolean areAntecedente) {
        this.nume = nume;
        this.serieBuletin = serieBuletin;
        this.esteCautatDePolitie = esteCautatDePolitie;
        this.areAntecedente = areAntecedente;
    }

    protected boolean verificaIdentitate(String serieBuletin){
        return serieBuletin.equals(this.serieBuletin);
    }

    public String getSerieBuletin() {
        return serieBuletin;
    }
}
