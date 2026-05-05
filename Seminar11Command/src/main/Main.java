package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Varlam");
        PersonalSpital asistent = new Asistent("Popa");

        Pacient pacient1 = new Pacient("Grigore");
        Pacient pacient2 = new Pacient("Avramescu");

        Command comanda1 = new Internare(medic, pacient1);
        Command command2 = new Tratare(asistent, pacient2);

        Operator operator = new Operator();
        operator.inregistreaza(comanda1);
        operator.inregistreaza(command2);
        operator.executaFISA();

        operator.inregistreaza(new Tratare(asistent, new Pacient("Leonida")));
        operator.executaFISA();
        operator.executaFISA();
    }
}