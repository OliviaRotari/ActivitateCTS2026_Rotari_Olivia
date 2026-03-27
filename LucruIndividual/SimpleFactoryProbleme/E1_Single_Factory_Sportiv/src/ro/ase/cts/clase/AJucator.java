package ro.ase.cts.clase;

import java.nio.MappedByteBuffer;

public abstract class AJucator {
    private String nume;
    private int nrTricou;
    private boolean esteCapitanulEchipei;

    public AJucator(String nume, int nrTricou, boolean esteCapitanulEchipei) {
        this.nume = nume;
        this.nrTricou = nrTricou;
        this.esteCapitanulEchipei = esteCapitanulEchipei;
    }
    public String informatiiGeneraleJucator() {
        StringBuilder sb=new StringBuilder(nume);
        sb.append("- jucatorul cu numarul: ").append(nrTricou);
        if(esteCapitanulEchipei) {
            sb.append("\n(Este capitanul echipei)");
        }
        return sb.toString();
    }
    public abstract void descriereProfilJucator();
}
