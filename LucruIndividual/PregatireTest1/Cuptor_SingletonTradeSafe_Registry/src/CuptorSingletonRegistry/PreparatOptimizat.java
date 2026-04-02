package CuptorSingletonRegistry;

public class PreparatOptimizat {
    private String denumire;
    private int timpDeGatire;
    private int temperaturaNecesara;

    public PreparatOptimizat(String denumire, int timpDeGatire, int temperaturaNecesara) {
        this.denumire = denumire;
        this.timpDeGatire = timpDeGatire;
        this.temperaturaNecesara = temperaturaNecesara;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getTimpDeGatire() {
        return timpDeGatire;
    }

    public int getTemperaturaNecesara() {
        return temperaturaNecesara;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PreratOptimizat{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", timpDeGatire=").append(timpDeGatire);
        sb.append(", temperaturaNecesara=").append(temperaturaNecesara);
        sb.append('}');
        return sb.toString();
    }
}
