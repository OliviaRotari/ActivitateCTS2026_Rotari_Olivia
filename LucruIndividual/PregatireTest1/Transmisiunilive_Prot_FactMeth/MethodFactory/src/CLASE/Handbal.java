package CLASE;

public class Handbal extends Sport {

    public Handbal(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void detaliiMeci() {
        System.out.println("Meci de handbal intre " + getEchipaGazda() + " si " + getEchipaOaspete());
    }
}
