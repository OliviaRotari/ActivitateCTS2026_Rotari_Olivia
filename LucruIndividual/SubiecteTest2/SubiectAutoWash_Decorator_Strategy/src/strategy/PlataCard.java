package strategy;

import java.sql.SQLOutput;

public class PlataCard implements IModPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cardul pentru suma de "+suma);
    }
}

