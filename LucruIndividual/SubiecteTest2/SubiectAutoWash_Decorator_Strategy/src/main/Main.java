package main;

import decorator.*;
import strategy.Client;
import strategy.PlataCard;
import strategy.PlataCash;
import strategy.PlataTelefon;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========Decorator=======");
        System.out.println();


        IABstractWashOptions program1=new SpalarePeriiFine(new ProgramSimplu());
        program1.descriereSpalare();

        System.out.println("Pret total: "+program1.getPret()+" RON");
        System.out.println();

        IABstractWashOptions program2=new SpalareSasiu( new SpalareApaDedurizata(new ProgramSimplu() ));
        program2.descriereSpalare();

        System.out.println("Pret total: "+program2.getPret()+" RON");
        System.out.println();

        IABstractWashOptions program3=new SpalarePeriiFine(new SpalareSasiu( new SpalareApaDedurizata( new ProgramSimplu())));
        program3.descriereSpalare();
        System.out.println("Pret total: "+program3.getPret()+" RON");
        System.out.println();


        System.out.println("\n\n====Strategy==========");
        Client client=new Client("Maria Mirabea");
        client.setModPlata(new PlataCard());
        client.achitaSpalare(30);
        System.out.println();

        client.setModPlata(new PlataCash());
        client.achitaSpalare(40);
        System.out.println();

        client.setModPlata(new PlataTelefon());
        client.achitaSpalare(10);
        System.out.println();
    }
}
