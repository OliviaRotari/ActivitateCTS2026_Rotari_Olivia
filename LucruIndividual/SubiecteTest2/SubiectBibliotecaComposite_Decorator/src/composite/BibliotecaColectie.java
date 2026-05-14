package composite;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaColectie implements IElementBibloteca{
    private List<IElementBibloteca> lista;
    private String numeColectie;


    public BibliotecaColectie(String numeColectie) {
        this.lista = new ArrayList<>();
        this.numeColectie = numeColectie;
    }


    @Override
    public void adaugaNod(IElementBibloteca element) {
        this.lista.add(element);
    }

    @Override
    public void stergeNod(IElementBibloteca element) {
this.lista.remove(element);
    }

    @Override
    public IElementBibloteca getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void printeazaInformatii() {
        System.out.println("\t"+"Colectia: "+numeColectie);
        for(IElementBibloteca element:lista){
            element.printeazaInformatii();
        }
    }
}
