package clase;

public abstract class DecoratorBon implements IBon {
    private IBon bonDecorat;

    public DecoratorBon(IBon bonDecorat) {
        this.bonDecorat = bonDecorat;
    }

    @Override
    public void printeazBon() {
        this.bonDecorat.printeazBon();
        printeazFelicitare();
    }

    public abstract void printeazFelicitare();
}
