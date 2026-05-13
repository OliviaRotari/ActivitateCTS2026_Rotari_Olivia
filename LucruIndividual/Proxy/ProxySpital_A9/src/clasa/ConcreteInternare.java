package clasa;

public class ConcreteInternare implements Internare{

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("POacientul: "+pacient.getNume()+" in varsta de "+pacient.getVarsta()
        +" ani a fost internat be baza asigurarii de sanatate");
    }
}
