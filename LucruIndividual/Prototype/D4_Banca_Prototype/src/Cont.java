public class Cont implements ICont {

    private String numeClient;
    private String IBAN;
    private Valuta valuta;
    private float sold;

    public Cont(String numeClient, String IBAN, Valuta valuta, float sold) {
        this.numeClient = numeClient;
        this.IBAN = IBAN;
        this.valuta = valuta;
        this.sold = sold;
    }

    public Cont() {
    }


    @Override
    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public void setValuta(Valuta valuta) {
        this.valuta = valuta;
    }

    @Override
    public void setSold(float sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Contul clientului ")
                .append(this.numeClient).append(":")
                .append("\n -.IBAN: ").append(this.IBAN)
                .append("\n->VALUTA: ").append(this.valuta)
                .append("\n ->SOLD ").append(this.sold)
                .append("\n");
        return sb.toString();
    }

    @Override
    public ICont clone() {
        Cont clona = new Cont();
        clona.setNumeClient(this.numeClient);
        clona.setIBAN(this.IBAN);
        clona.setValuta(this.valuta);
        clona.setSold(this.sold);
        return clona;
    }
}
