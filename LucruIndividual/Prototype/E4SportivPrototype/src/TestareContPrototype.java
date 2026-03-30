import java.util.HashMap;
import java.util.Map;

public class TestareContPrototype {
    public static void main(String[] args) {
        Map<Integer,String> istoricRezervari=new HashMap<>();
        istoricRezervari.put(1,"Meci Romania- Republica Moldova");
        AbstractCont prototip=new Cont("Olivia","ol@gmail.com","05/03/2026",istoricRezervari);

        AbstractCont clona=prototip.clona();
        clona.adaugaRezervare("Meci RO-Uk");
        System.out.println(prototip.toString());
        System.out.println("\n");
        System.out.println(clona.toString());

    }
}
