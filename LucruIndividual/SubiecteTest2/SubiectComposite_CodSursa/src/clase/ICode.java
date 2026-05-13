package clase;

public interface ICode {
    void adaugaUnitateCod(ICode unitateCod);
    void stergeUnitateCod(ICode unitateCod);
    void scrieUnitateCod(String aliniat);
    ICode getUnitateCod(int index);
}
