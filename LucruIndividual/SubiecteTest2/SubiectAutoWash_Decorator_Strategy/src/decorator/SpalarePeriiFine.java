package decorator;

public class SpalarePeriiFine extends DecoratorProgram{

    private static final double COST_PERII_FINE = 10;

    public SpalarePeriiFine(IABstractWashOptions programSpalare) {
        super(programSpalare);
    }

    @Override
    public void descriereSpalare() {
        super.descriereSpalare();
        adaugaOptiune();
    }

    @Override
    public double getPret() {
        return super.getPret() + COST_PERII_FINE;
    }

    @Override
    public void adaugaOptiune() {
        System.out.println("Optiune suplimentara: spalare cu perii fine.");
    }
}
