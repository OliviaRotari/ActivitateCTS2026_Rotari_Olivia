public class ContractAsigurareBuilder extends AbstractConfigurare {
    ContractAsigurare contract;

    public ContractAsigurareBuilder(String numeClient) {
        contract = new ContractAsigurare();
        contract.setNumeClient(numeClient);
    }

    @Override
    public void adaugaAsigurareAuto(IAsigurareAuto asigurareAuto) {
        contract.setAsigurareParcAuto(asigurareAuto);
    }

    @Override
    public void adaugaAsigurareProductie(IAsigurareProductie asigurareProductie) {
        contract.setAsigurareProductie(asigurareProductie);
    }

    @Override
    public void adaugaAigurareServixii(IAsigurareServicii asigurareServicii) {
        contract.setAsigurareServicii(asigurareServicii);
    }

    @Override
    public ContractAsigurare getContract() {
        return this.contract;
    }
}