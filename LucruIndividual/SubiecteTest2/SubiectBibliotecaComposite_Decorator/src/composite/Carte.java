package composite;

public class Carte implements IElementBibloteca{
    private String titlu;
    private String autor;

    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
    }

    @Override
    public void adaugaNod(IElementBibloteca element) {
        throw  new RuntimeException("Cartea este nod frunza.Operatia nu este implementata");
    }

    @Override
    public void stergeNod(IElementBibloteca element) {
        throw  new RuntimeException("Cartea este nod frunza.Operatia nu este implementata");
    }

    @Override
    public IElementBibloteca getNod(int index) {
        throw  new RuntimeException("Cartea este nod frunza.Operatia nu este implementata");
    }

    @Override
    public void printeazaInformatii() {
        System.out.println("\t\tCartea: "+titlu+"-Autor: "+autor);
    }
}
