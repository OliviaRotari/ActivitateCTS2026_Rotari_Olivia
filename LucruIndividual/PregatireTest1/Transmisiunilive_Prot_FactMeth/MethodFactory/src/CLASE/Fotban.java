package CLASE;

public class Fotban extends Sport{

    public Fotban(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void detaliiMeci() {
        System.out.println("Meci de fotbal intre " + getEchipaGazda() + " si " + getEchipaOaspete());
    }
}
