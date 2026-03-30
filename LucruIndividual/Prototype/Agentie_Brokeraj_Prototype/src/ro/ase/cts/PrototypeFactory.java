package ro.ase.cts;

import java.util.HashMap;

public class PrototypeFactory {
    private static HashMap<String, ContractAsigurare> prototipuriContrate = new HashMap<>();

    static {
        //incarcare prototipuri contracte asigurare

        System.out.println("\nInitializare contrecte asigurare");

        AsigurareAuto asigurareAuto = new AsigurareAuto();
        asigurareAuto.setId("auto");
        prototipuriContrate.put("auto", asigurareAuto);

        AsigurareLocuinte asigurareLocuinte = new AsigurareLocuinte();
        asigurareLocuinte.setId("locuinta");
        prototipuriContrate.put("locuinta", asigurareLocuinte);
        System.out.println("\n");
    }

    public static ContractAsigurare getPrototip(String id) {
        ContractAsigurare copiePrototip = null;
        ContractAsigurare prototip = prototipuriContrate.get(id);

        if (prototip != null) {
            copiePrototip = (ContractAsigurare) prototip.clone();
        }
        return copiePrototip;
    }
}