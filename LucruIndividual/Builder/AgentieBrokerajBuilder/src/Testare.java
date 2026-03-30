public class Testare {
    public static void main(String[] args) {
        ContractAsigurareBuilder builder = new ContractAsigurareBuilder("Vornicescu Pavel");
        ConfigurareContractAsigurari configurator = new ConfigurareContractAsigurari(builder);
        configurator.build();
        ContractAsigurare contract = configurator.getBuilder().getContract();//aici este fara getBuilder
    }
}
