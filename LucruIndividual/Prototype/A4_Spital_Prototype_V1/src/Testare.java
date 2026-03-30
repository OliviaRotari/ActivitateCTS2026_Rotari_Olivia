import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Testare {
    public static void main(String[] args) {
        Map<String, Double> compozitieMedicament = new HashMap<>();
        compozitieMedicament.put("Paracetamol", 50.0);
        compozitieMedicament.put("Magneziu", 10.0);
        compozitieMedicament.put("Calciu", 25.0);
        Reteta retetaParacetamol = new Reteta("Paracetamol", compozitieMedicament);

        AbstractReteta clonaRetetaParacetamol = retetaParacetamol.clone();
        System.out.println("--RETETA PROTOTIP--");
        System.out.println(retetaParacetamol.toString());
        clonaRetetaParacetamol.modificareCantitateSolutie("Paracetamol", 40.0);
        clonaRetetaParacetamol.modificareCantitateSolutie("Ibuprofen", 50.0);
        System.out.println("--CLONA RETETA--");
        System.out.println(clonaRetetaParacetamol.toString());
    }
}
