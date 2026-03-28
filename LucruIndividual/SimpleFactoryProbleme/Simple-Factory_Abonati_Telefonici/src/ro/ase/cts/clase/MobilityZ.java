package ro.ase.cts.clase;

public class MobilityZ implements ISubscription{
    private final double costPeLuna;


    public MobilityZ(double costPeLuna) {
        this.costPeLuna = costPeLuna;
    }

    @Override
    public void detaliiAbonament() {
        System.out.println("Abonament de tip MobilityZ avand  incluse servicii de voce, servicii de date si tv online\"");
    }

    @Override
    public double CalculeazaCostulAbonamentului(int nrLuniContractuale) {
        return nrLuniContractuale>12?0.9*costPeLuna*nrLuniContractuale:costPeLuna*nrLuniContractuale;
    }
}
