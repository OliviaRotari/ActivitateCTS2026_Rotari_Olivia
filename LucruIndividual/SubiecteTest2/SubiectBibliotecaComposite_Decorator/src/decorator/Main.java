package decorator;

import composite.Carte;
import composite.IElementBibloteca;

public class Main {
    public static void main(String[] args) {
        //Carte simpla fara decorator
        IElementBibloteca carte= new Carte("Cosmos", "Carl Sagan");
        carte.printeazaInformatii();

        System.out.println("Aceasta carte nu are citare");
        System.out.println();

        //decorator Apa
        CitareDecorator carteAPA=new TipApa(carte,"Sagan. C","Cosmos", 1980);
        carteAPA.printeazaInformatii();
        System.out.println("Aceasta carte are format de citare APA:");
        carteAPA.afisareCitare();
        System.out.println();

        //decorator Chicago
        CitareDecorator carteChicago=new TipChicago(carte, "Sagan, Carl", "Cosmos", "New York", 1980);
        carteChicago.printeazaInformatii();
        System.out.println("Aceasta carte are format de citare Chicago:");
        carteChicago.afisareCitare();
        System.out.println();

        // Decoram cu MLA
        CitareDecorator carteMLA = new TipMLA(carte, "Sagan, Carl", "Cosmos", 1990, "New York");
        carteMLA.printeazaInformatii();
        System.out.println("Aceasta carte are format de citare MLA:");
        carteMLA.afisareCitare();
    }
}
