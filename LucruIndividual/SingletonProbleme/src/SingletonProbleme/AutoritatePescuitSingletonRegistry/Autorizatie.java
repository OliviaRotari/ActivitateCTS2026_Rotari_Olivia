package SingletonProbleme.AutoritatePescuitSingletonRegistry;

public class Autorizatie {
    private String destinatar;
    private int nrAutorizatie;
    private String data;

     Autorizatie(String destinatar, int nrAutorizatie, String data) {
        this.destinatar = destinatar;
        this.nrAutorizatie = nrAutorizatie;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autorizatie{");
        sb.append("destinatar='").append(destinatar).append('\'');
        sb.append(", nrAutorizatie=").append(nrAutorizatie);
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
