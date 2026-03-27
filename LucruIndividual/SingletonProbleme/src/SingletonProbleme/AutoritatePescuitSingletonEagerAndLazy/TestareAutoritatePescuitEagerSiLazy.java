package SingletonProbleme.AutoritatePescuitSingletonEagerAndLazy;

public class TestareAutoritatePescuitEagerSiLazy {
    public static void main(String[] args) {
//        AutoritatePescuitSingletonLazy autoritatePescuitSingletonLazy= AutoritatePescuitSingletonLazy.getInstanta("Maria","maria.ro",10,10);
//        autoritatePescuitSingletonLazy.emiteAutorizatie("Vlad Petrascu");
//        System.out.println(autoritatePescuitSingletonLazy);
//
//        AutoritatePescuitSingletonLazy autoritatePescuitSingletonLazy2 = AutoritatePescuitSingletonLazy.getInstanta("Pera","pera.ro",10,20);
//        autoritatePescuitSingletonLazy2.emiteAutorizatie("Pera Maria");
//        System.out.println(autoritatePescuitSingletonLazy2);
//    }


        AutoritatePescuitEager autoritatePescuitEager=AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.concediaza(1);
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("AVA");
        autoritatePescuitEager.setWebsite("ava.ro");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.emiteAutorizatie("Olivia Ro");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager2 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager2.emiteAutorizatie("Valcescu Vlad");
        System.out.println(autoritatePescuitEager2.toString());
    }
}
