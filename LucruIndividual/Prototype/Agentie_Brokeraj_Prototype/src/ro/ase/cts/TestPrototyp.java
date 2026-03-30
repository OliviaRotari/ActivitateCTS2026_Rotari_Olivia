package ro.ase.cts;

public class TestPrototyp {
    public static void main(String[] args) {
        AsigurareAuto asigurare1 = new AsigurareAuto();
        asigurare1.setId("1");
        System.out.println(asigurare1);

        AsigurareAuto asigurare2 = new AsigurareAuto();
        asigurare1.setId("2");
        System.out.println(asigurare2);


        ContractAsigurare asigurare3 =
                PrototypeFactory.getPrototip("auto");
        if (asigurare3 != null) {
            System.out.println(asigurare3);
        }


        ContractAsigurare asigurare4 =
                PrototypeFactory.getPrototip("auto");
        if (asigurare4 != null) {
            System.out.println(asigurare4);
        }


        ContractAsigurare asigurare5 =
                PrototypeFactory.getPrototip("locuinta");
        if (asigurare5 != null) {
            System.out.println(asigurare5);
        }


        //testare shallow-copy fara prototype
        if (asigurare1.getClauzaContractuale() == asigurare2.getClauzaContractuale()) {
            System.out.println("\n1.Aceleasi clauze contractuale");
        }


        if (asigurare3.getClauzaContractuale() == asigurare4.getClauzaContractuale())
            System.out.println("\n2.Aceleasi clauze contractuale");

    }
}
