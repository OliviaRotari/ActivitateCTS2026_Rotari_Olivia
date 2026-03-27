package ro.ase.cts.clase;

public class Atacant extends AJucator{
    private int nrGoluri;

    public Atacant(String nume, int nrTricou, boolean esteCapitanulEchipei,int nrGoluri) {
        super(nume, nrTricou, esteCapitanulEchipei);
        this.nrGoluri=nrGoluri;
    }

    @Override
    public void descriereProfilJucator(){
        StringBuilder sb= new StringBuilder(this.informatiiGeneraleJucator());
        sb.append("\n Pozitie in teren:ATACANT ")
                .append("\nNumar Goluri: ").append(nrGoluri).append("\n");
        System.out.println(sb.toString());
    }
}
