package ro.ase.cts.clase;

public class FilmDrama implements IFilm{
    @Override
    public void reda(String sala) {
        System.out.println("In sala: "+sala+" este un film de DRAMA");
    }
}
