package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FilmActiune;
import ro.ase.cts.clase.IFilm;

public class CreatorFilmActiune implements ICreator{
    @Override
    public IFilm creareObject() {
        return new FilmActiune();
    }
}
