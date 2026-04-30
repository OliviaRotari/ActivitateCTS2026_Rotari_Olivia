package clase;

import java.util.StringJoiner;

public class Rezervare {
    private int numarMasa;
    private String oraRezervare;
    private int numarPersoane;

    public Rezervare(int numarMasa, String oraRezervare, int numarPersoane) {
        this.numarMasa = numarMasa;
        this.oraRezervare = oraRezervare;
        this.numarPersoane = numarPersoane;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Rezervare.class.getSimpleName() + "[", "]")
                .add("numarMasa=" + numarMasa)
                .add("oraRezervare='" + oraRezervare + "'")
                .add("numarPersoane=" + numarPersoane)
                .toString();
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }
}
