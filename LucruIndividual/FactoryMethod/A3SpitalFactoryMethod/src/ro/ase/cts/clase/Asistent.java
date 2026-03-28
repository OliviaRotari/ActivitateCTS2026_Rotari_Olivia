package ro.ase.cts.clase;

public class Asistent extends APersonal{
    public Asistent(String nume, String prenume, int salariu, int aniVechime) {
        super(nume, prenume, salariu, aniVechime);
    }

    @Override
    public void descriereProfilAngajare() {
        StringBuilder sb=new StringBuilder(getNumeComplet().toUpperCase());
        sb.append("\n").append("Functie: ASISTENT").append("\n")
                .append("Salariul: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("Angajat din anul: ").append(this.getAnAngajare()).append(" ( ")
                .append(this.getAniVechime()).append(" ani vechime");
        System.out.println(sb.toString());
    }
}
