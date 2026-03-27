package SingletonProbleme.AgentieSingletonLazyInitialization;

public class TestareAgentieLazy {
    public static void main(String[] args) throws Exception{
        AgentieLazy agentie1=AgentieLazy.getInstance("EY");
        AgentieLazy agentie2=AgentieLazy.getInstance("Telekom");

        if(agentie1==agentie2){
            System.out.println("Referinte identice");
        }else{
            System.out.println("Referinte diferite-singletin necorespuzator");
        }

        //testare vanzare pachet
        agentie1.vindePachet();
        agentie2.vindePachet();

        System.out.println("Pachete vandute "+agentie1.getNrPacheteVandute());
    }
}
