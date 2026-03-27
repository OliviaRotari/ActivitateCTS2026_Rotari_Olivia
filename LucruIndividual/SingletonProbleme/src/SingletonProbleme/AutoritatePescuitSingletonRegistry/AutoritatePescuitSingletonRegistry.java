package SingletonProbleme.AutoritatePescuitSingletonRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuitSingletonRegistry {

    private String denumire;
    private String website;
    private int nrAngajati;

    //private instance
    private static AutoritatePescuitSingletonRegistry instanta;

    //private constructor
    private  AutoritatePescuitSingletonRegistry(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static AutoritatePescuitSingletonRegistry getInstanta(String denumire, String website, int nrAngajati) {
        if(instanta == null) {
            instanta = new AutoritatePescuitSingletonRegistry(denumire,website,nrAngajati);
        }
        return instanta;
    }

    private  Map<String, Autorizatie> registry =new HashMap<>();

    public Autorizatie emiteAutorizatie(String numePersoana) {
        if(!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autorizatie(numePersoana, registry.size()+1, (new Date()).toString()));
        }
        return registry.get(numePersoana);
    }
}
