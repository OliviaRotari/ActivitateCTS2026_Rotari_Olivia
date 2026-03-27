package ro.ase.cts.clase;

public class PachetTransport implements PachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar transport");
    }
}
