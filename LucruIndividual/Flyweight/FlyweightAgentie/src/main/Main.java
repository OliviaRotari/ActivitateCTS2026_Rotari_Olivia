package main;
import clase.FabricaDePachete;
import clase.Optionale;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        FabricaDePachete fabricaPachete = new FabricaDePachete();
        Optionale optional1=new Optionale(true, 1);
        Optionale optional2=new Optionale(false, 4);
        Optionale optional3=new Optionale(true, 4);
        Optionale optional4=new Optionale(false, 5);

        PachetTuristic pachetTuristic =(PachetTuristic) fabricaPachete.getPachetTuristic(1);
        pachetTuristic.descrierePachet(optional1);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional2);
        optional2.setNrExcursii(50);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional2);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional3);
        fabricaPachete.getPachetTuristic(1).descrierePachet(optional4);

        System.out.println(fabricaPachete.getNrPachete());

        /*	IPachetTuristic pachet1=new PachetTuristic(1, "Blue Lagoon", "Santorini", true);

		Optionale op1=new Optionale(true, 2, pachet1);
		Optionale op2=new Optionale(false, 1, pachet1);

		Optionale op3=new Optionale(true, 2, );*/

    }

}
