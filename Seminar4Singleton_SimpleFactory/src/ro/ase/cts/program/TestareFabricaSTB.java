package ro.ase.cts.program;

import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.MijlocTransportFabrica;
import ro.ase.cts.clase.TipMijlocTransport;

public class TestareFabricaSTB {

    public static void afisareMijlocTransport(MijlocTransport mijlocTransport) {
        mijlocTransport.afisareDescriere();
    }
    public static void main(String[] args) {
        //MijlocTransportFactory factory = new MijlocTransportFactory();
        MijlocTransportFabrica factory = MijlocTransportFabrica.getInstance();


        MijlocTransport autobuz= factory.getMijlocTransport("Mercedes",435, TipMijlocTransport.AUTOBUZ);
        MijlocTransport troleibuz= factory.getMijlocTransport("Volvo",45, TipMijlocTransport.TROLEIBUZ);
        MijlocTransport trmvai= factory.getMijlocTransport("Zimm",5, TipMijlocTransport.TRAMVAI);

        afisareMijlocTransport(autobuz);
        afisareMijlocTransport(troleibuz);
        afisareMijlocTransport(trmvai);



    }
}