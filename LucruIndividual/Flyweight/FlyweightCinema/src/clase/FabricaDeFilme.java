package clase;

import java.util.HashMap;

public class FabricaDeFilme {
    private HashMap<String,IFilm> filme=new HashMap<String,IFilm>();

    public  int dimensiuneListaFilme(){
        return  this.filme.size();
    }

    public IFilm getFilm(String denumire) {
       IFilm film=filme.get(denumire);
       if(film==null){
           film=new Film(denumire);
           filme.put(denumire,film);
       }
       return film;
    }
}
