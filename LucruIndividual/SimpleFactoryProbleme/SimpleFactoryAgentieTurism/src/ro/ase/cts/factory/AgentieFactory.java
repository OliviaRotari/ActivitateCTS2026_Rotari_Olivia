package ro.ase.cts.factory;

import ro.ase.cts.clase.PachetCazare;
import ro.ase.cts.clase.PachetCazareTransport;
import ro.ase.cts.clase.PachetTransport;
import ro.ase.cts.clase.PachetTuristic;

public class AgentieFactory{
   public PachetTuristic crearePachet(TipPachet tipPachet) throws Exception{
    switch (tipPachet){
        case pachetCazare :
            return new PachetCazare();
        case pachetTransport:
            return new PachetTransport();
        case pachetCazareSiTransport:
            return new PachetCazareTransport();
        default:
            throw new Exception("Tipul primit nu este corect");
    }
   }
}
