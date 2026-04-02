package CLASE;

public class Basket extends Sport{
    public Basket(String echipaGazda, String echipaOaspete) {
        super(echipaGazda, echipaOaspete);
    }

    @Override
    public void detaliiMeci() {
        System.out.println("Meci de paschet intre: "+getEchipaGazda()+"si"+getEchipaOaspete());
    }
}
