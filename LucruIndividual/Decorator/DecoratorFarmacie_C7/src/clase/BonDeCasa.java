package clase;

public class BonDeCasa implements IBon {
    private int nrBon;
    private double sumaBon;

    public BonDeCasa(int nrBon, double sumaBon) {
        this.nrBon = nrBon;
        this.sumaBon = sumaBon;
    }


    @Override
    public void printeazBon() {
        System.out.println("Bonul numarul " + this.nrBon + "- total de plata:" + this.sumaBon + " RON");
    }
}
