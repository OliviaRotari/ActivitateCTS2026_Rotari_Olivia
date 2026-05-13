package clase;

public class NodFrunzaUnitateCod implements ICode {
    private TipNodFrunza tip;
    private String antet;

    public NodFrunzaUnitateCod(TipNodFrunza tip, String antet) {
        this.tip = tip;
        this.antet = antet;
    }

    @Override
    public void adaugaUnitateCod(ICode unitateCod) {
        throw new RuntimeException("Operatie interzisa pe acest nivel!");
    }

    @Override
    public void stergeUnitateCod(ICode unitateCod) {
        throw new RuntimeException("Operatie interzisa pe acest nivel!");
    }

    @Override
    public void scrieUnitateCod(String aliniat) {
        System.out.println(aliniat+"Se parseaza "+this.tip+ " "+this.antet+"..");
    }

    @Override
    public ICode getUnitateCod(int index) {
        throw new RuntimeException("Operatie interzisa pe acest nivel!");
    }
}
