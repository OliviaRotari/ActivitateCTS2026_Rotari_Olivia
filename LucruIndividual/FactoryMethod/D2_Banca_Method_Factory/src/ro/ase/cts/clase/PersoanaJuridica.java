package ro.ase.cts.clase;

public class PersoanaJuridica extends AClient{
    private String cui;

    public PersoanaJuridica(String nume, String adresa,String cui) {
        super(nume, adresa);
        this.cui=cui;
    }

    @Override
    public void profilClient() {
        StringBuilder sb = new StringBuilder("--PROFIL PERSOANA JURIDICA--");
        sb.append("\n Nume Client: ").append(this.getNume())
                .append("\nCUI: ").append(this.cui)
                .append("\nAdresa: ").append(this.getAdresa());
        System.out.println(sb.toString());
    }
}
