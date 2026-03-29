package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FilmDrama;
import ro.ase.cts.clase.IFilm;

public class CreatorFilmDrama implements ICreator{
    @Override
    public IFilm creareObject() {
        return new FilmDrama();
    }
}
