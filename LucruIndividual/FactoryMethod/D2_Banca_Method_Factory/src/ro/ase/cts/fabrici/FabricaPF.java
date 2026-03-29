package ro.ase.cts.fabrici;

import ro.ase.cts.clase.AClient;
import ro.ase.cts.clase.PersoanaFizica;

public class FabricaPF implements FabricaClienti{
    @Override
    public AClient creeazaClient(String nume, String adresa, String extra) {
        return new PersoanaFizica(nume,adresa,extra);
    }
}
