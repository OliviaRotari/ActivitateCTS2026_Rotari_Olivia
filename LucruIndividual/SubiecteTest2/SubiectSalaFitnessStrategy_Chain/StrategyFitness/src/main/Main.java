package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IExercitiu flotari=new Flotari();
        IExercitiu fandari = new Fandari();
        IExercitiu salturi = new Salturi();
        IExercitiu genuflexiuni = new Genoflexiuni();

        IChallenge challenge1=new Challenge("Maria");
        IChallenge challenge2=new Challenge("Mirabela");

        challenge1.setExercitiu(fandari);
        challenge1.executaGhallenge();
        challenge1.setExercitiu(salturi);
        challenge1.executaGhallenge();

        challenge2.setExercitiu(flotari);
        challenge2.executaGhallenge();
        challenge2.setExercitiu(genuflexiuni);
        challenge2.executaGhallenge();

    }
}
