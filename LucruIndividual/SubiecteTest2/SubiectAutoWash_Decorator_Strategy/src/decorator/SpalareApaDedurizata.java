package decorator;
public class SpalareApaDedurizata extends DecoratorProgram {

    private static final double COST_APA_DEDURIZATA = 8;

    public SpalareApaDedurizata(IABstractWashOptions programSpalare) {
        super(programSpalare);
    }

    @Override
    public void descriereSpalare() {
        super.descriereSpalare();
        adaugaOptiune();
    }

    @Override
    public double getPret() {
        return super.getPret() + COST_APA_DEDURIZATA;
    }

    @Override
    public void adaugaOptiune() {
        System.out.println("Optiune suplimentara: spalare cu apa dedurizata.");
    }
}