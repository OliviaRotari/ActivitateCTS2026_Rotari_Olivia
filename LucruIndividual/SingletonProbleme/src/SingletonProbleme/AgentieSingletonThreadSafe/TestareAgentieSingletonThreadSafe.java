package SingletonProbleme.AgentieSingletonThreadSafe;

import java.sql.SQLOutput;

public class TestareAgentieSingletonThreadSafe {
    public static void main(String[] args) {
        Agentie agentie1 = Agentie.getInstance("TravisRo", "Bucuresti", 10);
        Agentie agentie2 = Agentie.getInstance("RomTur", "Cluj", 50);

        System.out.println(agentie1.toString());
        System.out.println(agentie2.toString());

        agentie1.vindePachet();
        agentie2.vindePachet();

        //testare vanzare pachete
        System.out.println(agentie1.toString());
        agentie2.vindePachet();

        System.out.println(agentie1.toString());
    }
}
