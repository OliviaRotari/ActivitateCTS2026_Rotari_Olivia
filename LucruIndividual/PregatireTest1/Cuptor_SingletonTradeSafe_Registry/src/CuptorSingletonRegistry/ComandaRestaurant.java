package CuptorSingletonRegistry;

public class ComandaRestaurant {
    private int idComanda;
    private PreparatOptimizat preparat;

    public ComandaRestaurant(int idComanda, PreparatOptimizat preparat) {
        this.idComanda = idComanda;
        this.preparat = preparat;
    }

    public int getIdComanda() {
        return idComanda;
    }

    public PreparatOptimizat getPreparat() {
        return preparat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComandaRestaurant{");
        sb.append("idComanda=").append(idComanda);
        sb.append(", preparat=").append(preparat);
        sb.append('}');
        return sb.toString();
    }
}
