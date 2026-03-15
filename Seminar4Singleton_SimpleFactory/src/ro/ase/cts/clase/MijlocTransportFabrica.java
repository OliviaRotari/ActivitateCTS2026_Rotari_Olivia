package ro.ase.cts.clase;

public class MijlocTransportFabrica {
    private static MijlocTransportFabrica instance;

    public  static MijlocTransportFabrica getInstance() {
        if(instance ==null)
            instance = new MijlocTransportFabrica();
        return instance;
    }

    private MijlocTransportFabrica() {
    }

    public  MijlocTransport getMijlocTransport(String  marca, int linie, TipMijlocTransport tip) {
        if(tip==TipMijlocTransport.AUTOBUZ)
            return  new Autobuz(marca, linie);
        if(tip==TipMijlocTransport.TRAMVAI)
            return  new Tramvai(marca, linie);
        if(tip==TipMijlocTransport.TROLEIBUZ)
            return  new Troleibuz(marca, linie);
        else
            return null;
    }
}