package composite;

public class Main {
    public static void main(String[] args) {
        IElementBibloteca colectieStiinta = new BibliotecaColectie("Stiinta");
        IElementBibloteca colectieArta = new BibliotecaColectie("Arta");
        IElementBibloteca biblioteca = new BibliotecaColectie("Biblioteca Centrala");

        IElementBibloteca carte1 = new Carte("Scurta istorie a timpului", "Stephen Hawking");
        IElementBibloteca carte2 = new Carte("Cosmos", "Carl Sagan");
        IElementBibloteca carte3 = new Carte("Mona Lisa", "R. P. C. Mutter");
        IElementBibloteca carte4 = new Carte("Istoria artei", "E. H. Gombrich");

        colectieStiinta.adaugaNod(carte1);
        colectieStiinta.adaugaNod(carte2);
        colectieArta.adaugaNod(carte3);
        colectieArta.adaugaNod(carte4);


    biblioteca.adaugaNod(colectieStiinta);
    biblioteca.adaugaNod(colectieArta);

   biblioteca.printeazaInformatii();
    }
}
