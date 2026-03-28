package ro.ase.cts.clase;

public class Brancardier extends APersonal{
    public Brancardier(String nume, String prenume, int salariu, int aniVechime) {
        super(nume, prenume, salariu, aniVechime);
    }

    @Override
    public void descriereProfilAngajare() {
        StringBuilder sb = new StringBuilder(this.getNumeComplet().toUpperCase());
        sb.append("\n").append("Functie: Brancardier ").append("\n")
                .append("Salariul: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("Angajat din anul: ").append(this.getAnAngajare()).append(" ( ")
                .append(this.getAniVechime()).append(" ani vechime");
        System.out.println(sb.toString());
    }
}
