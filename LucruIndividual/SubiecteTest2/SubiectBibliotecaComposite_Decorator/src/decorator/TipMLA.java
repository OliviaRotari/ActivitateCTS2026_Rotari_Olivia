package decorator;

import composite.IElementBibloteca;

public class TipMLA extends CitareDecorator{
    private String autor;
    private String titlu;
    private int an;
    private String locatie;

    public TipMLA(IElementBibloteca elementBibloteca, String autor, String titlu, int an, String locatie) {
        super(elementBibloteca);
        this.autor = autor;
        this.titlu = titlu;
        this.an = an;
        this.locatie = locatie;
    }


    @Override
    public void afisareCitare() {
        System.out.println("Citare MLA: " + autor + ". " + titlu + ". " + locatie + ", " + an + ".");
    }
}
