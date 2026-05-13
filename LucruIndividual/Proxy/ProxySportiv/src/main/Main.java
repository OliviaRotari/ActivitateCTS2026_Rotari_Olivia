package main;

import clase.IVanzareBilet;
import clase.Persoana;
import clase.ProxyVarsta;
import clase.VanzareBilet;

public class Main {
    public static void main(String[] args) {
        Persoana p1=new Persoana("Ionel ",13);
        Persoana p2=new Persoana("Marin",23);


        IVanzareBilet proxy=new ProxyVarsta(new VanzareBilet());
        proxy.vindeBiet(p1);
        proxy.vindeBiet(p2);
    }
}
