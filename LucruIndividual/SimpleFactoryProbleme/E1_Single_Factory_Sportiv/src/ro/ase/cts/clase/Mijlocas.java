package ro.ase.cts.clase;


public class Mijlocas extends AJucator{
    private  int nrPaseReusite;
    public Mijlocas(String nume, int nrTricou, boolean esteCapitanulEchipei, int nrPaseReusite) {
        super(nume, nrTricou, esteCapitanulEchipei);
        this.nrPaseReusite=nrPaseReusite;
    }

    @Override
    public void descriereProfilJucator() {
        StringBuilder sb= new StringBuilder(this.informatiiGeneraleJucator());
        sb.append("\n Pozitie in teren:FUNDAS")
                .append("\nNumar pase reusite: ").append(nrPaseReusite).append("\n");
        System.out.println(sb.toString());
    }
}
