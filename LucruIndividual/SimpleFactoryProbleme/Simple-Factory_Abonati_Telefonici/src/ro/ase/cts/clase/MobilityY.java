package ro.ase.cts.clase;

public class MobilityY implements ISubscription{
    private final double costPeLuna;

    public MobilityY(double costPeLuna) {
        this.costPeLuna = costPeLuna;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("Abonament de tip MobilityY avand incluse doar servicii de date");
    }

    @Override
    public double CalculeazaCostulAbonamentului(int nrLuniContractuale) {
        return nrLuniContractuale*costPeLuna;
    }
}
