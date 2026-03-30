import java.util.HashMap;
import java.util.Map;


// Clasa Laborator care gestionează prototipurile
public class Laborator {
    private Map<String, IReteta> prototipuri;

    public Laborator() {
        prototipuri = new HashMap<>();
    }

    // Adaugă un prototip
    public void adaugaPrototip(String nume, IReteta reteta) {
        prototipuri.put(nume, reteta);
    }

    public IReteta obtineReteta(String nume) {
        IReteta prototip = prototipuri.get(nume);
        if (prototip != null) {
            return prototip.dublica();
        }
        return null;
    }

}
