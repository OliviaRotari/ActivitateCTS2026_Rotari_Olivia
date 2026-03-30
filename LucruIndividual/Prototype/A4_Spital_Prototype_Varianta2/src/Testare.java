public class Testare {
    public static void main(String[] args) {
        // Creăm laboratorul
        Laborator laborator = new Laborator();

        // Creăm o rețetă inițială
        Reteta retetaParacetamol = new Reteta();
        retetaParacetamol.setNumeMedicament("Paracetamol");
        retetaParacetamol.adaugaIngredient("Paracetamol pulbere", 500.0);
        retetaParacetamol.adaugaIngredient("Apa distilată", 200.0);

        // Adăugăm prototipul în laborator
        laborator.adaugaPrototip(retetaParacetamol.getNumeMedicament(), retetaParacetamol);

        // Creăm noi medicamente prin clonare (fără constructor)
        IReteta copia1 = laborator.obtineReteta("Paracetamol");
        IReteta copia2 = laborator.obtineReteta("Paracetamol");

        // Modificăm doar copia2 pentru demonstrație
        ((Reteta) copia2).adaugaIngredient("Glicerină", 50.0);

        // Afișăm rețetele
        System.out.println(retetaParacetamol);
        System.out.println("=== Copie 1 ===\n" + copia1);
        System.out.println("=== Copie 2 (modificată) ===\n" + copia2);
    }
}
