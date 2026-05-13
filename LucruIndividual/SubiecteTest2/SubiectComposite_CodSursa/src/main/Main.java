package main;

import clase.CompositeUnitateCod;
import clase.ICode;
import clase.NodFrunzaUnitateCod;
import clase.TipNodFrunza;

public class Main {
    public static void main(String[] args) {
        ICode functia1=new NodFrunzaUnitateCod(TipNodFrunza.functie,"int getSuma(int a, int b)");
        ICode functia2=new NodFrunzaUnitateCod(TipNodFrunza.functie,"int getPutere(int a, int b)");
        ICode metoda=new NodFrunzaUnitateCod(TipNodFrunza.metoda," void printeazaRezultat()");


        ICode clasaCalculator=new CompositeUnitateCod("Calculator");
        ICode clasaOperatii=new CompositeUnitateCod("OperatiiMatematice");

        clasaOperatii.adaugaUnitateCod(functia1);
        clasaOperatii.adaugaUnitateCod(functia2);

        clasaCalculator.adaugaUnitateCod(metoda);
        clasaCalculator.adaugaUnitateCod(clasaOperatii);

        clasaCalculator.scrieUnitateCod(" ");

        System.out.println();
        clasaCalculator.getUnitateCod(0).scrieUnitateCod(" ");
        System.out.println();
        functia1.scrieUnitateCod(" ");
    }
}
