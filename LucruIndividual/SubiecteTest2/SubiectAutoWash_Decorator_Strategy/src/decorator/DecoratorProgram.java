package decorator;

public abstract class DecoratorProgram implements IABstractWashOptions{
    private IABstractWashOptions programSpalare;

    public DecoratorProgram(IABstractWashOptions programSpalare) {
        this.programSpalare = programSpalare;
    }

    @Override
    public void descriereSpalare() {
        this.programSpalare.descriereSpalare();
    }

    @Override
    public double getPret() {
        return this.programSpalare.getPret();
    }

    public abstract void adaugaOptiune();
}
