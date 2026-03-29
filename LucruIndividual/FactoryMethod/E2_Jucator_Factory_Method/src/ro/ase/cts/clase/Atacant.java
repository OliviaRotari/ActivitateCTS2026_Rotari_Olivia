package ro.ase.cts.clase;

public class Atacant extends AJucator {
    private int nrGoluri;

    public Atacant(String nume, int nrTricou, boolean esteCapitanulEchipei, int nrGoluri) {
        super(nume, nrTricou, esteCapitanulEchipei);
        this.nrGoluri = nrGoluri;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder sb = new StringBuilder(this.informatiiGeneraleJucator());
        sb.append("\nPozitie in teren: ATACANT")
                .append("\nNr goluri: ").append(this.nrGoluri).append("\n");
        System.out.println(sb.toString());
    }
}
