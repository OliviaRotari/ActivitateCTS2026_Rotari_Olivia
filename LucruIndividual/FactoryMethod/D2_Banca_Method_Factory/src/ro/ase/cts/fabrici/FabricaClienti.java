package ro.ase.cts.fabrici;

import ro.ase.cts.clase.AClient;

public interface  FabricaClienti {
    AClient creeazaClient(String nume, String adresa, String extra);
}
