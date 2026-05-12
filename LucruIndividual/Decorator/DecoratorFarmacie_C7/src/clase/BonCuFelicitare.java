package clase;

public class BonCuFelicitare extends DecoratorBon {
    public BonCuFelicitare(IBon bonDecorat) {
        super(bonDecorat);
    }

    @Override
    public void printeazFelicitare() {
        System.out.println("\"Farmacia noastra va ureaza un An Nou fericit");
    }
}
