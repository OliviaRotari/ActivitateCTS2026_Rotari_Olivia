package SingletonProbleme.AutoritatePescuitSingletonEagerAndLazy;

public class AutoritatePescuitSingletonLazy {
    private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutorizatiiEmise;

    private static AutoritatePescuitSingletonLazy instance = null;

    private AutoritatePescuitSingletonLazy(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutorizatiiEmise = nrAutorizatiiEmise;
    }

    //thread safe


    public static synchronized AutoritatePescuitSingletonLazy getInstance(String denumire, String website, int nrAngajati, int nrAutorizatiiEmise) {
        if (instance == null) {
            instance = new AutoritatePescuitSingletonLazy(denumire, website, nrAngajati, nrAutorizatiiEmise);
        }
        return instance;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void angajeaza(int nrAngajati) {
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(int nrAngajati) {
        this.nrAngajati -= nrAngajati;
    }

    public void emieAutorizatie(String numePersana){
        System.out.println(new StringBuilder("A fost emisa autorizatia pentru").append(numePersana));
        nrAutorizatiiEmise++;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutoritatePescuitSingletonLazy{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", website='").append(website).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append(", nrAutorizatiiEmise=").append(nrAutorizatiiEmise);
        sb.append('}');
        return sb.toString();
    }
}
