package clase;

public class Loc implements IStructuraStadion{
    private int nrLoc;

    public Loc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public void adaugaElement(IStructuraStadion element) {
        throw  new RuntimeException("Operatiune interzisa");
    }

    @Override
    public void stergeElement(IStructuraStadion element) {
        throw  new RuntimeException("Operatiune interzisa");
    }

    @Override
    public void descrieElement(String aliniat) {
        System.out.println(aliniat+"Loc: "+nrLoc);
    }
}
