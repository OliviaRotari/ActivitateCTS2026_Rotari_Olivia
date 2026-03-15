package ro.ase.cts.clase;

public class Rezervare implements PrototypeRezervare {
    private String numeClient;
    private int numarPersoane;
    private String oraRezervare;
    private String numarTelefon;

    public Rezervare(String numeClient, int numarPersoane, String oraRezervare, String numarTelefon) {
        if (numeClient.length() >= 3) {
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Client";
        }
        if (numarPersoane > 0) {
            this.numarPersoane = numarPersoane;
        } else {
            this.numarPersoane = 1;
        }
        this.oraRezervare = oraRezervare;
        if (numarTelefon.length() == 10) {
            this.numarTelefon = numarTelefon;
        }
    }

    private Rezervare() {
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    public void setOraRezervare(String oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.numarPersoane = this.numarPersoane;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.numarTelefon = this.numarTelefon;
        return rezervareNoua;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append(", oraRezervare='").append(oraRezervare).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}