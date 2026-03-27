package ro.ase.cts.clase;

public class Portar extends AJucator{
    private  int nrParade;

    public Portar(String nume, int nrTricou, boolean esteCapitanulEchipei, int nrParade) {
        super(nume, nrTricou, esteCapitanulEchipei);
        this.nrParade=nrParade;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder sb= new StringBuilder(this.informatiiGeneraleJucator());
        sb.append("\n Pozitie in teren:PORTAR ")
                .append("\nNumar parade: ").append(nrParade).append("\n");
        System.out.println(sb.toString());
    }
}