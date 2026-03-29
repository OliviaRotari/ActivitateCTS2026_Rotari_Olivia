package ro.ase.cts.program;

import ro.ase.cts.clase.IFilm;
import ro.ase.cts.fabrici.CreatorFilmActiune;
import ro.ase.cts.fabrici.CreatorFilmComedie;
import ro.ase.cts.fabrici.CreatorFilmDrama;
import ro.ase.cts.fabrici.ICreator;

public class TestareFactoryMethod {
   private static void difuzeazaFilm(ICreator creatorFilm, String sala){
       //metoda lucreaza cu obiecte de tip ICeator;
       //nu stim ce fel de filme sunt create prin metoda creatObject
       IFilm film =creatorFilm.creareObject();
       //orice tip de film creat, este redat prin apelul metodei reda(;
       film.reda(sala);
   }

    public static void main(String[] args) {
        difuzeazaFilm(new CreatorFilmActiune(),"Carmen Tanase");
        difuzeazaFilm(new CreatorFilmComedie(),"Radu Belgian");
        difuzeazaFilm(new CreatorFilmDrama(),"Gheorghe Dinca");
    }
}
