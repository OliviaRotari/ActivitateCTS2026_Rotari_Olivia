package CuptorSingletonThradeSafe;

public class PreparatTS {
    private String denumire;
    private int timpGatireMinute;
    private int temperaturaNecesara;

    public PreparatTS(String denumire, int timpGatireMinute, int temperaturaNecesara) {
        this.denumire = denumire;
        this.timpGatireMinute = timpGatireMinute;
        this.temperaturaNecesara = temperaturaNecesara;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getTimpGatireMinute() {
        return timpGatireMinute;
    }

    public int getTemperaturaNecesara() {
        return temperaturaNecesara;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preparat{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", timpGatireMinute=").append(timpGatireMinute);
        sb.append(", temperaturaNecesara=").append(temperaturaNecesara);
        sb.append('}');
        return sb.toString();
    }


}
