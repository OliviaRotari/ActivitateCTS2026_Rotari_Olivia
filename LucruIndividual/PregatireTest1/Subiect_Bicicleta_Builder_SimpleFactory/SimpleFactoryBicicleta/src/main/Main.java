package main;

import clase.Bicicleta;
import clase.TipFrana;
import fabrici.FabricaBiciclete;
import fabrici.TipBicicleta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        FabricaBiciclete fabrica=new FabricaBiciclete();
        List<Bicicleta> listaBiciclete=new ArrayList<>();
        try {
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.MTB, 30, 499.99f, TipFrana.DISC,
                    false, false, true, true));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA, 45, 1200, TipFrana.V_BRAKE,
                    true, true, true, true));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.MTB, 24.3f, 549.99f, TipFrana.TAMBUR,
                    false, false, false, false));
            listaBiciclete.add(fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA, 39.8f, 1000, TipFrana.V_BRAKE,
                    false, false, true, true));
            Bicicleta bicicleta5=fabrica.creeazaBicicleta(TipBicicleta.ELECTRICA, 39.8f, 1000, TipFrana.V_BRAKE,
                    false, false, true, true);
            listaBiciclete.add(bicicleta5);
        } catch (Exception e) {
            e.printStackTrace();
        }


        int contor = 1;
        for (Bicicleta bicicleta : listaBiciclete) {
            System.out.println("Bicicleta " + contor + ":");
            bicicleta.descriere();
            contor++;
        }


    }
}
