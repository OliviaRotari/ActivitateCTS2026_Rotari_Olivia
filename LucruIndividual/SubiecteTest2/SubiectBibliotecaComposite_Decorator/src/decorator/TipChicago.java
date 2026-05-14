package decorator;

import composite.IElementBibloteca;

public class TipChicago extends CitareDecorator {
    private String autor;
    private String titlu;
    private String editura;
    private int an;

    public TipChicago(IElementBibloteca elementBibloteca, String autor, String titlu, String editura, int an) {
        super(elementBibloteca);
        this.autor = autor;
        this.titlu = titlu;
        this.editura = editura;
        this.an = an;
    }


    @Override
    public void afisareCitare() {
        System.out.println("Citare Chicago: " + autor + ". \"" + titlu + "\". " + editura + ", " + an + ".");

    }
}
