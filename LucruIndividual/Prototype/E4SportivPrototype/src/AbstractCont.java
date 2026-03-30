import java.util.Map;

public abstract class AbstractCont {
    private String numeSuporter;
    private String email;
    private String dataInregistrarii;
    private Map<Integer,String> istoricRezervari;

    public AbstractCont(String numeSuporter, String email, String dataInregistrarii, Map<Integer, String> istoricRezervari) {
        this.numeSuporter = numeSuporter;
        this.email = email;
        this.dataInregistrarii = dataInregistrarii;
        this.istoricRezervari = istoricRezervari;
    }

    public String getNumeSuporter() {
        return numeSuporter;
    }

    public String getEmail() {
        return email;
    }

    public String getDataInregistrarii() {
        return dataInregistrarii;
    }

    public Map<Integer, String> getIstoricRezervari() {
        return istoricRezervari;
    }

    public void adaugaRezervare(String rezervareNoua){
       int urmatoareaRezervare=this.istoricRezervari.size()+1;
       istoricRezervari.put(urmatoareaRezervare,rezervareNoua);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractCont{");
        sb.append("numeSuporter='").append(numeSuporter).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dataInregistrarii='").append(dataInregistrarii).append('\'');
        sb.append(", istoricRezervari=").append(istoricRezervari);
        sb.append('}');
        return sb.toString();
    }

    public abstract Cont clona();
}
