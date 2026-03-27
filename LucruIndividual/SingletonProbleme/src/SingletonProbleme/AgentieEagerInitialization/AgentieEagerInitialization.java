package SingletonProbleme.AgentieEagerInitialization;

import java.util.StringJoiner;

public class AgentieEagerInitialization {
    private String nume;
    private float capital;
    private int nrAngajati;

    private static final AgentieEagerInitialization instanta= new AgentieEagerInitialization();

    private AgentieEagerInitialization() {
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

    public static AgentieEagerInitialization getInstanta() {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgentieEagerInitialization{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}
