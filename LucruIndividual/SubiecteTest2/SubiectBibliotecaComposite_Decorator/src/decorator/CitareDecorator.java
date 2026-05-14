package decorator;

import composite.IElementBibloteca;

public abstract class CitareDecorator implements IElementBibloteca {
    private IElementBibloteca elementBibloteca;

    public CitareDecorator(IElementBibloteca elementBibloteca) {
        this.elementBibloteca = elementBibloteca;
    }

    @Override
    public void adaugaNod(IElementBibloteca element) {
        this.elementBibloteca.adaugaNod(element);
    }

    @Override
    public void stergeNod(IElementBibloteca element) {
        this.elementBibloteca.stergeNod(element);
    }

    @Override
    public IElementBibloteca getNod(int index) {
        return elementBibloteca.getNod(index);
    }

    @Override
    public void printeazaInformatii() {
        elementBibloteca.printeazaInformatii();
    }

    public abstract void afisareCitare();
}
