package ro.ase.cts.AgentieSingletonLazyInitialization;

public class AgentieLazy {
    private String numeAgentie;
    private int nrPacheteVandute;

    private static AgentieLazy instance = null; //instanta unica lazy

    //constrcutor privat


    private AgentieLazy(String numeAgentie) throws Exception {
        if (instance != null) {
            throw new Exception("Instanta deja creeata");
        }
        this.numeAgentie = numeAgentie;
        this.nrPacheteVandute = 0;
    }

    //metoda lazy

    public static AgentieLazy getInstance(String numeAgentie) throws Exception {
        if (instance == null) {
            instance = new AgentieLazy(numeAgentie);
        }
        return instance;
    }

    //vanzare pachete
    public void vindePachet() {
        nrPacheteVandute++;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public int getNrPacheteVandute() {
        return nrPacheteVandute;
    }
}
