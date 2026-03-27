package ro.ase.cts.CinemaSimpleFactory.clase;

public class Rezervare implements PrototypeRezervare{
    private String numeClient;
    private int nrPersoane;
    private String ora;
    private String nrTelefon;

    public Rezervare(String numeClient, int nrPersoane, String ora, String nrTelefon) {
        if(numeClient.length()>=3) {
            this.numeClient = numeClient; }
        else {
            this.numeClient = "Client";
        }

        if(nrPersoane > 0){
            this.nrPersoane = nrPersoane;
        }
        else{
            this.nrPersoane = 1;
        }
        this.ora = ora;
        if(nrTelefon.length()>=10) {
            this.nrTelefon = nrTelefon;
        }
        else{
            this.nrTelefon = "Telefon";
        }
    }

    private Rezervare() {
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.ora = this.ora;
        rezervareNoua.nrTelefon = this.nrTelefon;
        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}