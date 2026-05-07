package clase;

public class RaportOnline extends Decorator {
    public RaportOnline(IRaportAnalize raportAnalize) {
        super(raportAnalize);
    }

    @Override
    protected void vizualizareRaportOnline() {
        System.out.println("puteti vizualiza raportul online!");
    }
}