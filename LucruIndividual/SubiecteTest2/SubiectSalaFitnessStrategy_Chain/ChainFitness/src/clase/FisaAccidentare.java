package clase;

public class FisaAccidentare {
    private  String numeCursant;
    private TipGravitateAccidentare gravitate;

    public FisaAccidentare(String numeCursant, TipGravitateAccidentare gravitate) {
        this.numeCursant = numeCursant;
        this.gravitate = gravitate;
    }

    public String getNumeCursant() {
        return numeCursant;
    }

    public TipGravitateAccidentare getGravitate() {
        return gravitate;
    }

}
