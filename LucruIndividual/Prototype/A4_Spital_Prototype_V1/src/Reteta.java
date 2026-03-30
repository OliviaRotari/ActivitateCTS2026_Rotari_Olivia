import java.util.HashMap;
import java.util.Map;

public class Reteta extends AbstractReteta{

    public Reteta() {
        super();
    }

    public Reteta(String denumireMedicament, Map<String, Double> compozietieMedicament) {
        super(denumireMedicament, compozietieMedicament);
    }

    @Override
    public AbstractReteta clone() {
        Reteta reteta =new Reteta();
        Map<String,Double> compozitieClona = new HashMap<>(this.getCompozietieMedicament());
        reteta.setCompozietieMedicament(compozitieClona);
        reteta.setDenumireMedicament(this.getDenumireMedicament());
        return reteta;
    }
}
