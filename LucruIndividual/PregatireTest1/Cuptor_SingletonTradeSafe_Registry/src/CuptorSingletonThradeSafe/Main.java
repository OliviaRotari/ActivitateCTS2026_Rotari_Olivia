package CuptorSingletonThradeSafe;

public class Main {
    public static void main(String[] args) {
        CuptorRestaurantTS cuptor1 = CuptorRestaurantTS.getInstanta("CuptorPizza", 180);
        CuptorRestaurantTS cuptor2 = CuptorRestaurantTS.getInstanta("CuptorPlacinta", 240);

        System.out.println(cuptor1);
        System.out.println(cuptor2);

        PreparatTS preparat1 = new PreparatTS("Pizza2Branza", 12, 220);
        PreparatTS preparat2 = new PreparatTS("Capriciosa", 20, 180);
        PreparatTS preparat3 = new PreparatTS("PlacinaMere", 30, 170);
        PreparatTS preparat4 = new PreparatTS("PlacintaDovleac", 20, 200);

        ComandaPreparat comanda1 = new ComandaPreparat(1, preparat1);
        ComandaPreparat comanda2 = new ComandaPreparat(2, preparat2);
        ComandaPreparat comanda3 = new ComandaPreparat(3, preparat3);
        ComandaPreparat comanda4 = new ComandaPreparat(1, preparat2);
        System.out.println("====CUPTOR 1=====");
        cuptor1.adaugaComandaInAsteptare(comanda1);
        cuptor1.adaugaComandaInAsteptare(comanda2);

        cuptor1.afiseazaListaAsteptare();

        System.out.println("====CUPTOR 2=====");
        cuptor2.adaugaComandaInAsteptare(comanda3);
        cuptor2.adaugaComandaInAsteptare(comanda4);
        cuptor2.afiseazaListaAsteptare();
        System.out.println("\n===========Verisicare instante=====");
        if (cuptor1 == cuptor2) {
            System.out.println("Cuptoarelr au aceasi instanta");
        } else {
            System.out.println("Instante diferite");
        }
    }
}
