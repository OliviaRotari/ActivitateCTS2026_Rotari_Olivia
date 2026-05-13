package clase;

import java.util.StringJoiner;

public class Film implements IFilm{
    private String denumire;

    public Film(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void play(Sala sala) {
        System.out.println(denumire+" a inceput in sala "+sala.getNumarSala());
    }


}
