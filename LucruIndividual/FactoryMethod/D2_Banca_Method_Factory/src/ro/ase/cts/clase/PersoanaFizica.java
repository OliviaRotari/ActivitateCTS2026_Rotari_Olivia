package ro.ase.cts.clase;

public class PersoanaFizica extends AClient{
    private String cnp;

    public PersoanaFizica(String nume, String adresa,String cnp) {
        super(nume, adresa);
        this.cnp=cnp;
    }

    @Override
    public void profilClient() {
        StringBuilder sb = new StringBuilder("--PROFIL PERSOANA FIZICA--");
        sb.append("\n Nume Client: ").append(this.getNume())
                .append("\nCNP: ").append(this.cnp)
                .append("\nAdresa: ").append(this.getAdresa());
        System.out.println(sb.toString());
    }
}
