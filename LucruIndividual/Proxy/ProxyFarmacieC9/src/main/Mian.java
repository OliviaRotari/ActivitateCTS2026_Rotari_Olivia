package main;

import clase.Achizitie;
import clase.Client;
import clase.IAchizitie;
import clase.ProxyAchizitieMedicament;

public class Mian {
    public static void main(String[] args) {
        IAchizitie achizitie=new Achizitie();
        IAchizitie proxy=new ProxyAchizitieMedicament(achizitie);
        proxy.achizitioneazaMedicament("Paracetamol",new Client("Ion",true));
    proxy.achizitioneazaMedicament("Ozempic",new Client("Maria", false));
    }
}
