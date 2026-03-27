package ro.ase.cts.clase;

public abstract class ACredit {
    private String beneficiar;

    public abstract String getTip();
    public abstract void afisare();

    public String getBeneficiar() {
        return beneficiar;
    }

    public void setBeneficiar(String beneficiar) {
        this.beneficiar = beneficiar;
    }
}
