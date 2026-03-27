package ro.ase.cts.clase;

public class CreditIpotecar extends ACredit{
    @Override
    public String getTip() {
        return "Credit ipotecar";
    }

    @Override
    public void afisare() {
        System.out.println("Acesta este un: "+getTip()+" pentru: "+getBeneficiar());
    }
}
