public class Testare {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar();
        cont.setDestinatar("Robu Ana");
        cont.setSuma(1000);
        cont.setMoneda("RON");
        cont.setInternetBanking(true);
        cont.setCardAtasat(true);
        cont.setContSalariu(true);

        System.out.println(cont.toString());

        //utilizare builder
        ContBancar contBuilderV2 = new ContBancarBuilderV2().setDetinator("Petrache Ion").setSuma(600)
                .setMoneda("EURO").setCardAtasat(true).setInternetBanking(true).build();

        System.out.println(contBuilderV2.toString());

        ContBancar contBuilderV1 = new ContBancarBuilder1().setDestinatar("Ion Petrascu").setSuma(500).setMoneda("EURO").setInternetBanking(true).build();
        System.out.println(contBuilderV1);


    }
}
