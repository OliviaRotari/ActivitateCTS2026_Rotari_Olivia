package clase;

public class Spectator {
    private String nume;
    private VerificareSpectator tipVerificare;

    public Spectator(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setTipVerificare(VerificareSpectator tipVerificare) {
        this.tipVerificare = tipVerificare;
    }

    public void controlAcces(){
   this.tipVerificare.verificareSpectator(this);
    }
}
