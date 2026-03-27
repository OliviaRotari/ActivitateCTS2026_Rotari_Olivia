package SingletonProbleme.AutoritatePescuitSingletonRegistry;

public class TestareAutoritatePescuitSingletonRegistry {
    public static void main(String[] args) {
        AutoritatePescuitSingletonRegistry autoritatePescuit1=AutoritatePescuitSingletonRegistry.getInstanta("ANAF","anpa.ro",100);
        Autorizatie autorizatieOliviaR=autoritatePescuit1.emiteAutorizatie("Olivia R");
        System.out.println(autorizatieOliviaR);

        Autorizatie autorizatieOliviaR2=autoritatePescuit1.emiteAutorizatie("Olivia Ro");
        System.out.println(autorizatieOliviaR);


    }
}
