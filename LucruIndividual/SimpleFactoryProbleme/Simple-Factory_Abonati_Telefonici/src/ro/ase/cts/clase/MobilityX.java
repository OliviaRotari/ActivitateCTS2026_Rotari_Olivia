package ro.ase.cts.clase;

public class MobilityX implements ISubscription{

   private final double costPeLuna;

    public MobilityX(double costPeLuna) {
        this.costPeLuna = costPeLuna;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("Abonament de tip MobilityX avand incluse doar servicii de voce");
    }

    @Override
    public double CalculeazaCostulAbonamentului(int nrLuniContractuale) {
        {
            return nrLuniContractuale*costPeLuna;
        }
    }
}
