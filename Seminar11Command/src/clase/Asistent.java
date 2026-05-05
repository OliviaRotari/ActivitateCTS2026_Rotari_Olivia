package clase;

public class Asistent implements PersonalSpital {
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistentul: " + this.nume + " trateaza imediat pacientul: " + pacient.getNume());
    }
}