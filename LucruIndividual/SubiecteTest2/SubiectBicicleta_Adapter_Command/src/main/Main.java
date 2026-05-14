package main;

import adapter.AdapterBicicleta;
import adapter.BiciletElectrica;
import adapter.IPachetTuristic;
import adapter.PachetExcursie;
import command.ComandaRezervare;
import command.CommandVanzare;
import command.Operator;
import command.PachetCroaziera;

public class Main {
    public static void afisarePachet(IPachetTuristic pachetTuristic) {
        pachetTuristic.descriePachet();
    }

    public static void main(String[] args) {
        System.out.println("====Adapter=======");
        IPachetTuristic excurie = new PachetExcursie("Grecia");
        /*    afisarePachet(excurie);

        IPachetTuristic pachetBicicleta=new AdapterBicicleta(new BiciletElectrica("MotoBike 2"));
        pachetBicicleta.descriePachet();
        pachetBicicleta.vindePachet();
        pachetBicicleta.rezervaPachet();*/


        IPachetTuristic croaziera = new PachetCroaziera("Elada");
        Operator operator = new Operator();

        System.out.println("====Rezervari====");

        operator.invocaComanda(new ComandaRezervare(excurie));
        operator.invocaComanda(new ComandaRezervare(croaziera));

        System.out.println();
        System.out.println("======Vanzare======");
        operator.invocaComanda(new CommandVanzare(excurie));
        operator.invocaComanda(new CommandVanzare(croaziera));

        System.out.println();
        System.out.println("=====Bicicleta externa =====");
        BiciletElectrica bicileta=new BiciletElectrica("MaxBike");
        System.out.println(bicileta.toString());
        bicileta.inchiriataBicicle();
        bicileta.achitaCursa();

        System.out.println("====Folosim ADAPTER===");
        IPachetTuristic bicicleta2=new AdapterBicicleta(new BiciletElectrica("Bike"));
        operator.invocaComanda(new ComandaRezervare(bicicleta2));
        operator.invocaComanda(new CommandVanzare( bicicleta2));


    }
}
