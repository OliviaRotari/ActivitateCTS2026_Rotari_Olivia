package main;

import clase.PachetTransport;
import clase.Persoana;
import clase.ProxyPachet;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Georgescu", 24);
        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        ProxyPachet pachetTransportProxy = new ProxyPachet(persoana);
        pachetTransportProxy.rezervaPachet();
    }
}