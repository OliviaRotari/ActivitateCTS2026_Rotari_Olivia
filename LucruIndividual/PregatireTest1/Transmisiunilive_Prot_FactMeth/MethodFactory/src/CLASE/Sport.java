package CLASE;



public abstract class Sport {
    private String echipaGazda;
    private String echipaOaspete;

    public Sport(String echipaGazda, String echipaOaspete) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspete = echipaOaspete;
    }

    public String getEchipaGazda() {
        return echipaGazda;
    }

    public String getEchipaOaspete() {
        return echipaOaspete;
    }

    public abstract void detaliiMeci();
}
