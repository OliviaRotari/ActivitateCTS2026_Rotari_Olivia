import java.util.Map;

public abstract class AbstractReteta {
    private String denumireMedicament;
    private Map<String,Double> compozietieMedicament;

    public AbstractReteta() {
    }

    public AbstractReteta(String denumireMedicament, Map<String, Double> compozietieMedicament) {
        this.denumireMedicament = denumireMedicament;
        this.compozietieMedicament = compozietieMedicament;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public Map<String, Double> getCompozietieMedicament() {
        return compozietieMedicament;
    }

    public void setDenumireMedicament(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    public void setCompozietieMedicament(Map<String, Double> compozietieMedicament) {
        this.compozietieMedicament = compozietieMedicament;
    }

    public void modificareCantitateSolutie(String solutie, double cantitate) {
        if(compozietieMedicament.containsKey(solutie)) {
            compozietieMedicament.put(solutie,cantitate);
        } else {
            System.out.println("Solutia "+solutie+" nu exista in compozitia medicamentului "+denumireMedicament);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RETETA ");
        sb.append(this.getDenumireMedicament().toUpperCase()).append(":\n");
        for(Map.Entry<String,Double> entry: this.getCompozietieMedicament().entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }

    public  abstract AbstractReteta clone();
}
