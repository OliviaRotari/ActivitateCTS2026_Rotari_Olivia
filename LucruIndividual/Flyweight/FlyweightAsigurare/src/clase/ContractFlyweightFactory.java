package clase;

import java.util.HashMap;
import java.util.Map;

public class ContractFlyweightFactory {
    private Map<String, ContractAsigurari> listaContracte = new HashMap<String, ContractAsigurari>();
    private static int nrContractePrintate = 0;


    public ContractAsigurari getContract(String tipContract) {
        nrContractePrintate++;
        ContractAsigurari contract = listaContracte.get(tipContract);
        if (contract == null) {
            System.out.println("\nS-a creat o matrita de tip " + tipContract + "\n");
            contract = new ContractAsigurari(tipContract);
            listaContracte.put(tipContract, contract);
        }
        return contract;
    }

    public int getNrContractePrintate() {
        return nrContractePrintate;
    }

    public int getNumarMatriteContracte() {
        return listaContracte.size();
    }
}
