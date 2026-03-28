package ro.ase.cts.program;

import ro.ase.cts.clase.IPachetTuristic;
import ro.ase.cts.fabrici.*;

public class TestareAgentieFM {
    public static void main(String[] args) {
        PachetTuristicFactory fabrica = new CazareFactory();
        PachetTuristicFactory fabricaTransport = new TransportFactory();

        IPachetTuristic pachet=fabrica.crearePachet(TipPachetCazare.CazareCabana);
        pachet.afisareDescriere();
        pachet=fabricaTransport.crearePachet(TipPachetTransport.TransportMicrobuz);
        pachet.afisareDescriere();
    }
}
