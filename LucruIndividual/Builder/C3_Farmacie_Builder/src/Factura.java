public class Factura {
    private  String idFactura;
    private  String numeClient;
    private int nrPungi;
    private boolean platesteCuCardul;
    private  boolean areCardDeFidelitate;
    private int cotaTVA;

    public Factura(String idFactura, String numeClient,
                   int nrPungi, boolean platesteCuCardul,
                   boolean areCardDeFidelitate, int cotaTVA) {
        this.idFactura = idFactura;
        this.numeClient = numeClient;
        this.nrPungi = nrPungi;
        this.platesteCuCardul = platesteCuCardul;
        this.areCardDeFidelitate = areCardDeFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setNrPungi(int nrPungi) {
        this.nrPungi = nrPungi;
    }

    public void setPlatesteCuCardul(boolean platesteCuCardul) {
        this.platesteCuCardul = platesteCuCardul;
    }

    public void setAreCardDeFidelitate(boolean areCardDeFidelitate) {
        this.areCardDeFidelitate = areCardDeFidelitate;
    }

    public void setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    public  String decizieOptiuniExtra(boolean decizie) {
        return decizie ? "DA" :"NU";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nDetalii ale facturii ");
        sb.append(idFactura).append(" emisa pentru clientul ");
        sb.append(numeClient).append(":");
        sb.append("\n -Nr pungi: ").append(nrPungi);
        sb.append("\n -plata cu cardul: ").append(decizieOptiuniExtra(platesteCuCardul));
        sb.append("\n -Card de fidelitate: ").append(decizieOptiuniExtra(areCardDeFidelitate));
        sb.append("\n -Cota TVA: ").append(cotaTVA +"%");
        return sb.toString();
    }
}
