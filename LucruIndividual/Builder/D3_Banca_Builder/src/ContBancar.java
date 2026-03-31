public class ContBancar {
    private String destinatar;
    private double sumaBlocata;
    private double suma;
    private String moneda;

    private boolean cardAtasat;
    private boolean internetBanking;
    private boolean contSalariu;

    public ContBancar() {
    }

    public ContBancar(String destinatar, double sumaBlocata, double suma, String moneda, boolean cardAtasat, boolean internetBanking, boolean contSalariu) {
        super();
        this.destinatar = destinatar;
        this.sumaBlocata = sumaBlocata;
        this.suma = suma;
        this.moneda = moneda;
        this.cardAtasat = cardAtasat;
        this.internetBanking = internetBanking;
        this.contSalariu = contSalariu;
    }

    public void setDestinatar(String destinatar) {
        this.destinatar = destinatar;
    }

    public void setSumaBlocata(double sumaBlocata) {
        this.sumaBlocata = sumaBlocata;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    public String getDestinatar() {
        return destinatar;
    }

    public double getSumaBlocata() {
        return sumaBlocata;
    }

    public double getSuma() {
        return suma;
    }

    public String getMoneda() {
        return moneda;
    }

    public boolean areCardAtasat() {
        return cardAtasat;
    }

    public boolean areInternetBanking() {
        return internetBanking;
    }

    public boolean areContSalariu() {
        return contSalariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("destinatar='").append(destinatar).append('\'');
        sb.append(", sumaBlocata=").append(sumaBlocata);
        sb.append(", suma=").append(suma);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append(", contSalariu=").append(contSalariu);
        sb.append('}');
        return sb.toString();
    }

    //toString manual;
}
