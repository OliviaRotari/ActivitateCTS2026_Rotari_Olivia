package ro.ase.cts.fabrici;

import ro.ase.cts.clase.IPachetTuristic;
import ro.ase.cts.clase.TransportAutobuz;
import ro.ase.cts.clase.TransportMicrobuz;

public class TransportFactory implements PachetTuristicFactory{
    @Override
    public IPachetTuristic crearePachet(TipPachetTuristic tipPachetTuristic) {
        return switch (tipPachetTuristic){
            case TipPachetTransport.TransportAutobuz -> new TransportAutobuz();
            case TipPachetTransport.TransportMicrobuz -> new TransportMicrobuz();
            default -> null;
        };
    }
}
