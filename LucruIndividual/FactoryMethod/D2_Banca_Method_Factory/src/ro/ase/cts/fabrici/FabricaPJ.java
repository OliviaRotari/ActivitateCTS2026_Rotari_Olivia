package ro.ase.cts.fabrici;

import ro.ase.cts.clase.AClient;
import ro.ase.cts.clase.PersoanaJuridica;

public class FabricaPJ implements FabricaClienti{
    @Override
    public AClient creeazaClient(String nume, String adresa, String extra) {
        return new PersoanaJuridica(nume,adresa,extra);
    }
}
