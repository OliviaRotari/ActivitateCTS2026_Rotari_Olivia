package composite;

public interface IElementBibloteca {
    void adaugaNod(IElementBibloteca element);
    void stergeNod(IElementBibloteca element);
    IElementBibloteca getNod(int index);
    void printeazaInformatii();
}
