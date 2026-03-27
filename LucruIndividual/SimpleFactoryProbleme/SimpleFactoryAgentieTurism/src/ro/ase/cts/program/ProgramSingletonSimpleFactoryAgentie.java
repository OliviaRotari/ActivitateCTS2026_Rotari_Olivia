package ro.ase.cts.program;

import ro.ase.cts.clase.AgentieSingletonSimpleFactory;
import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.factory.TipPachet;

public class ProgramSingletonSimpleFactoryAgentie {
    public static void main(String[] args) {
        AgentieSingletonSimpleFactory agentieFabrica=AgentieSingletonSimpleFactory.getInstance();
        PachetTuristic pachetTuristic = null;
        try{
            pachetTuristic= agentieFabrica.crearePachet(TipPachet.pachetCazareSiTransport);
        } catch (Exception e) {
            e.printStackTrace();
        }
        pachetTuristic.descriere();
    }
}
