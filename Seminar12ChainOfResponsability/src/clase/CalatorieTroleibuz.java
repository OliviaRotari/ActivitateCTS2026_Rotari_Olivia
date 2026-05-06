package clase;

public class CalatorieTroleibuz extends CalatorieHandler {

    public CalatorieTroleibuz() {
        super();
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if (distanta < 3) {
            return "Troleibuz";
        }
        return super.calatorieHandler.recomandareCalatorie(distanta);
    }
}