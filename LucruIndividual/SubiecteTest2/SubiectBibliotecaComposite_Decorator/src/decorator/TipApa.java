package decorator;

import composite.IElementBibloteca;

public class TipApa extends CitareDecorator{
    private String autor;
    private String titlu;
    private int an;

    public TipApa(IElementBibloteca elementBibloteca, String autor, String titlu, int an) {
        super(elementBibloteca);
        this.autor = autor;
        this.titlu = titlu;
        this.an = an;
    }

    @Override
    public void afisareCitare() {
        System.out.println("Citare APA: " + autor + " (" + an + "). " + titlu + ".");    }
}
