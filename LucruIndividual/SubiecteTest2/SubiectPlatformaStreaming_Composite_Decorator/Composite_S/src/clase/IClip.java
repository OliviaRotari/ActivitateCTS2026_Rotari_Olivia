package clase;

public interface IClip {
    void afiseazaDetalii(String aliniat);
    void adaugaElement(IClip clip);
    void stergeElement(IClip clip);
    IClip getClip(int index);
    int getNumarComponente();
}
