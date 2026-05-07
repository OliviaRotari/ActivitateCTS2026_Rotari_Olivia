package main;

import clase.AdapterBar;
import clase.SoftBar;
import clase.SoftBucatarie;
import clase.SoftFacturi;

public class Main {
    public static void main(String[] args) {
        SoftFacturi softVechi=new SoftBucatarie();
        softVechi.printeazaFactura("Pizza");
        SoftFacturi adapter=new AdapterBar(new SoftBar());
        adapter.printeazaFactura("Campari");
        adapter.printeazaFactura("Suc");
        adapter.printeazaFactura("Sampanie");
    }
}
