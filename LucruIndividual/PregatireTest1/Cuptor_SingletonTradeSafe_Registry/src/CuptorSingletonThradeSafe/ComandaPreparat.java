package CuptorSingletonThradeSafe;

public class ComandaPreparat {
    private int idComanda;
    private PreparatTS preparat;

    public ComandaPreparat(int idComanda, PreparatTS preparat) {
        this.idComanda = idComanda;
        this.preparat = preparat;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public PreparatTS getPreparat() {
        return preparat;
    }
}
