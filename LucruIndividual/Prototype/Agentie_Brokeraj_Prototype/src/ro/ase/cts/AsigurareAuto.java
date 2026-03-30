package ro.ase.cts;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class AsigurareAuto extends ContractAsigurare{
    public AsigurareAuto() {
        System.out.println("Incarcare contract asigurare auto");
        clauzaContractuale=new ArrayList<>(2);
        this.tip="Asigurare auto";
    }
    @Override
    void prinatre() {
        System.out.println("Contract de tip:"+this.tip);
    }
}
