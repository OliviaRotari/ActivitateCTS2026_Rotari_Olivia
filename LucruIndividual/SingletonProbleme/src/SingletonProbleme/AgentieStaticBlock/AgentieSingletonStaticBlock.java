package SingletonProbleme.AgentieStaticBlock;

public class AgentieSingletonStaticBlock{
    private String nume;
    private float capital;
    private int nrAngajati;

    private static AgentieSingletonStaticBlock instanta;

  static {
      try{
          instanta=new AgentieSingletonStaticBlock();
      } catch (Exception e) {
          System.out.println("Eroare la crerea agentiei");
      }
  }

    public AgentieSingletonStaticBlock() {
        this.nume="RomTur";
        this.capital=2000;
        this.nrAngajati=10;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public static AgentieSingletonStaticBlock getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieSingleton Eager StaticBlock{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
