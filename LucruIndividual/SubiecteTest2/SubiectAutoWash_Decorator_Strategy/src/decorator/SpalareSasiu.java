package decorator;

public class SpalareSasiu extends DecoratorProgram {

    private static final double COST_SPALARE_SASIU = 15;

    public SpalareSasiu(IABstractWashOptions programSpalare) {
        super(programSpalare);
    }

    @Override
    public void descriereSpalare() {
        super.descriereSpalare();
        adaugaOptiune();
    }

    @Override
    public double getPret() {
        return super.getPret() + COST_SPALARE_SASIU;
    }

    @Override
    public void adaugaOptiune() {
        System.out.println("Optiune suplimentara: spalare sasiu.");
    }
}
