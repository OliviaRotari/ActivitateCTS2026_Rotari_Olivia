package CuptorSingletonRegistry;

public class TestareRegistry {
    public static void main(String[] args) {
        RegistruCuptor registruCuptor=RegistruCuptor.getInstanta("Gusto","Piata Romana 5");

        registruCuptor.adaugaCuptor("Cuptor-1",100);
        registruCuptor.adaugaCuptor("Cuptor-2",220);
        registruCuptor.adaugaCuptor("Cuptor-3",250);
        registruCuptor.adaugaCuptor("Cuptor-4",300);

        PreparatOptimizat focaccia = new PreparatOptimizat("Focaccia", 12, 180);
        PreparatOptimizat pizza = new PreparatOptimizat("Pizza Diavola", 15, 220);
        PreparatOptimizat friptura = new PreparatOptimizat("Friptura de vita", 30, 240);
        PreparatOptimizat somon = new PreparatOptimizat("Somon la cuptor", 20, 200);
        PreparatOptimizat sufleu = new PreparatOptimizat("Sufleu de ciocolata", 18, 260);

        ComandaRestaurant comanda1 = new ComandaRestaurant(101, focaccia);
        ComandaRestaurant comanda2 = new ComandaRestaurant(102, pizza);
        ComandaRestaurant comanda3 = new ComandaRestaurant(103, friptura);
        ComandaRestaurant comanda4 = new ComandaRestaurant(104, somon);
        ComandaRestaurant comanda5 = new ComandaRestaurant(105, sufleu);

        registruCuptor.asigneazaComandaOptima(comanda1);
        registruCuptor.asigneazaComandaOptima(comanda2);
        registruCuptor.asigneazaComandaOptima(comanda3);
        registruCuptor.asigneazaComandaOptima(comanda4);
        registruCuptor.asigneazaComandaOptima(comanda5);

        registruCuptor.afiseazaToateCuptoarele();
    }
}
