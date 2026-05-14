package main;

import observer.Client;
import observer.Observer;
import subject.Meci;
import subject.SalaSport;
import subject.SubiectObservabil;
import subject.TipMeci;

import javax.security.auth.Subject;

public class Main {
    public static void main(String[] args) {
        Observer observer1=new Client("Iliescu Ion");
        Observer observer2 = new Client("Ionescu Luciana");
        Observer observer3 = new Client("Petrescu Nicolae");

        Meci meciFotbal=new Meci("FC Unirea Slobozia - FC Victoria Tandarei", "17 mai 2026",
                "16:00", TipMeci.fotbal);
        Meci meciHandbal = new Meci("CSM Steaua - CSM Bacau", "24 mai 2026",
                "15:30", TipMeci.handbal);
        Meci meciVolei = new Meci("CS DINAMO BUCURESTI - CS Stiinta Bacau", "1 iunie 2026",
                "14:00", TipMeci.volei);

        SubiectObservabil sala=new SalaSport("SportArena","Bucuresti, Sector 1, Bd.Magheru, Nr.20");
        sala.adaugaObserver(observer1);
        sala.adaugaObserver(observer2);
        sala.adaugaObserver(observer3);

        ((SalaSport)sala).adagaMeci(meciFotbal);
        System.out.println();
        ((SalaSport) sala).adagaMeci(meciVolei);
        System.out.println();

        sala.stergeObserver(observer1);
        ((SalaSport) sala).adagaMeci(meciHandbal);
    }
}
