package decorator;

public class ProgramSimplu implements IABstractWashOptions{
    private static final double pretStandard=25;
    @Override
    public void descriereSpalare() {
        System.out.println("Program standard:spalare+spuma+clatire");
    }

    @Override
    public double getPret() {
        return pretStandard;
    }
}
