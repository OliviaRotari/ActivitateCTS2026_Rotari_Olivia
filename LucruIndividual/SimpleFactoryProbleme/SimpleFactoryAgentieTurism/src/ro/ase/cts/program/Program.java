package ro.ase.cts.program;

import ro.ase.cts.clase.PachetTuristic;
import ro.ase.cts.factory.AgentieFactory;
import ro.ase.cts.factory.TipPachet;

public class Program {
    public static void main(String[] args) {
       AgentieFactory agentieFactory=new AgentieFactory();
       PachetTuristic pachetTuristic=null;
       try {
           pachetTuristic=agentieFactory.crearePachet(TipPachet.pachetTransport);
       } catch (Exception e) {
           e.printStackTrace();
       }
       pachetTuristic.descriere();

    }

}
