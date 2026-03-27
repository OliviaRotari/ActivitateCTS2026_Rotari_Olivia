package SingletonProbleme.AgentieStaticBlock;

public class TestareAgentieSingletonStaticBlock {
    public static void main(String[] args) {
        AgentieSingletonStaticBlock agentie1 = AgentieSingletonStaticBlock.getInstanta();
        System.out.println(agentie1);
        AgentieSingletonStaticBlock agentie2 = AgentieSingletonStaticBlock.getInstanta();
        agentie1.setNume("RomAdventure");
        System.out.println(agentie1);
        System.out.println(agentie2);
    }
}
