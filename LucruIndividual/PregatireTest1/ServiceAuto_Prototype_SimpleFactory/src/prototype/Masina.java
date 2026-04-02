package prototype;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getAnFabricatie() {
        return this.anFabricatie;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
}
