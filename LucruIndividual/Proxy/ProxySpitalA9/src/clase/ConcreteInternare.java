package clase;

public class ConcreteInternare implements Internare {
    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " in varsta de " +
                pacient.getVarsta() + " ani a fost internt pe baza asigurarii de sanatate.");
    }
}