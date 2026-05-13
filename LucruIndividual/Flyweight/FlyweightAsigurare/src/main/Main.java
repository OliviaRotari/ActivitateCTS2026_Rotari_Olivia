package main;

import clase.ContractAsigurari;
import clase.ContractFlyweightFactory;

public class Main {
    private static final String tipuriContracte[] = {"RCA", "Casco", "Cargo", "CMR", "Medical"};

    public static void main(String[] args) {
        ContractFlyweightFactory contracteDePrintat = new ContractFlyweightFactory();

        for (int i = 0; i <= 30; i++) {
            ContractAsigurari contract = contracteDePrintat.getContract(getTipuriContractAleator());
            contract.setDateClient("Adresa: " + i);
            contract.setNumeClient("Client " + i);
            contract.printeaza();
        }


        System.out.println("\nS-au printat " + contracteDePrintat.getNrContractePrintate()
                + " documente de tip contracte");
        System.out.println("S-au creeat: " + contracteDePrintat.getNumarMatriteContracte()
                + " matrit pentru prinat contracte");
    }

    private static String getTipuriContractAleator() {
        return tipuriContracte[(int) (Math.random() * tipuriContracte.length)];
    }
}
