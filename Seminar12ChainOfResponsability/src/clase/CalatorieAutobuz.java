package clase;

public class CalatorieAutobuz extends CalatorieHandler {
    public CalatorieAutobuz() {
        super();
    }

    @Override
    public String recomandareCalatorie(double distanta) {
        if (distanta < 5) {
            return "Autobuz";
        }
        return super.calatorieHandler.recomandareCalatorie(distanta);
    }
}