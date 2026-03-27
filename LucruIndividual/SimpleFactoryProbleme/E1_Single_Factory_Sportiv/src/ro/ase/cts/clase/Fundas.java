package ro.ase.cts.clase;

public class Fundas extends AJucator{
    private int nrDeposedari;

    public Fundas(String nume, int nrTricou, boolean esteCapitanulEchipei, int nrDeposedari) {
        super(nume, nrTricou, esteCapitanulEchipei);
        this.nrDeposedari=nrDeposedari;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder sb= new StringBuilder(this.informatiiGeneraleJucator());
        sb.append("\n Pozitie in teren:FUNDAS")
                .append("\nNumar deposedari:").append(nrDeposedari).append("\n");
        System.out.println(sb.toString());
    }
}
