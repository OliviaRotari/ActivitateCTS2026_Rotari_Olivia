package clasa;

public class ProxyInternare implements Internare {
    private Internare internare;

    public ProxyInternare(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        if(pacient.isAreAsigurare()){
            this.internare.interneazaPacient(pacient);
        }else{
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat momentan, " +
                    "deoarece nu are asigurare de sanatate!");
        }
    }
}
