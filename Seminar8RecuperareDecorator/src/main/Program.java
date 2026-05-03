package main;

import clase.NotaDePlata;
import decorator.NotaDePlata1Mai;
import decorator.NotaDePlataDecorator;
import decorator.NotaDePlataPrintatNouAn;

public class Program {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(150.00f, "12 Ianuarie");
        notaDePlata.printeaza();

        NotaDePlataDecorator notaDePlataDecorator;

        int a = 2;
        if (a == 1) {
            notaDePlataDecorator = new NotaDePlataPrintatNouAn(notaDePlata);
        } else {
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}