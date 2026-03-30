package ro.ase.cts;

import java.util.ArrayList;

public class AsigurareLocuinte extends ContractAsigurare{
    public AsigurareLocuinte() {
        System.out.println("Incarcare contract asigurare loscuinte");
        clauzaContractuale=new ArrayList<>(5);
        this.tip="Asigurare locuinte";
    }

    @Override
    void prinatre() {
        System.out.println("Contract de tip:"+this.tip);
    }
}
