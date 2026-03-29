package ro.ase.cts.program;

import ro.ase.cts.clase.AClient;
import ro.ase.cts.fabrici.FabricaClienti;
import ro.ase.cts.fabrici.FabricaPF;

public class Testare {
    public static void main(String[] args) {
        FabricaClienti fabricaPF=new FabricaPF();
        FabricaClienti fabricaPJ=new FabricaPF();

        AClient pf=fabricaPF.creeazaClient("Ion","Alea Crinilor 5","12345678909");
        AClient pj=fabricaPJ.creeazaClient("SC Smile SRL ", "Str. Bunavointei 2","J28/124/2025");

        pf.profilClient();
        pj.profilClient();
    }
}
