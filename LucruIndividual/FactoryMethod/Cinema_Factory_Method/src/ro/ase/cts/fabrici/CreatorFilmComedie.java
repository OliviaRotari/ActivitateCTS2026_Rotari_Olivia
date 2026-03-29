package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FilmComedie;
import ro.ase.cts.clase.IFilm;

public class CreatorFilmComedie implements ICreator{
    @Override
    public IFilm creareObject() {
        return new FilmComedie();
    }
}
