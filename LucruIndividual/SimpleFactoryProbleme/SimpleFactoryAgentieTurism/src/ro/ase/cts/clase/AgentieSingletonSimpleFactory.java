package ro.ase.cts.clase;

import ro.ase.cts.factory.AgentieFactory;
import ro.ase.cts.factory.TipPachet;

public class AgentieSingletonSimpleFactory {
    private static AgentieSingletonSimpleFactory instance=null;

    private AgentieSingletonSimpleFactory() {
    }

    public static synchronized AgentieSingletonSimpleFactory getInstance() {
        if(instance==null){
            instance=new AgentieSingletonSimpleFactory();
        }
        return instance;
    }

    public PachetTuristic crearePachet(TipPachet tipPachet)throws Exception{
        switch (tipPachet){
            case pachetCazare :
                return  new PachetCazare();
            case pachetTransport:
                return new PachetTransport();
            case pachetCazareSiTransport:
                return new PachetCazareTransport();
            default:
                throw  new Exception("Tipul primit nu este corect");
        }
    }
}
