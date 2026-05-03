package main;

import clase.Medic;
import clase.Pacient;
import clase.Salon;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient =new Pacient("Ana",2);
        Medic medic =new Medic();
        Salon salon =new Salon();

//        if(pacient.getGravitate()>6){
//            if(medic.areInregistratPacientul(pacient)){
//                int patLiber = salon.getPatLiber();
//                if(patLiber!=-1){
//                    System.out.println("Pacientul "+pacient.getNume()+" este internat in patul "+patLiber);
//                    salon.ocupaPat(patLiber);
//                }
//            }
//            System.out.println("Trebuie trimitere de la medic");
//        }
//        System.out.println("Nu este atat de grav");

        Pacient pacient2=new Pacient("Ion",5);
        Pacient pacient3 =new Pacient("Vlada",9);
        Spital spital=new Spital(medic,salon);
        spital.internarePacient(pacient);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);

    }
}