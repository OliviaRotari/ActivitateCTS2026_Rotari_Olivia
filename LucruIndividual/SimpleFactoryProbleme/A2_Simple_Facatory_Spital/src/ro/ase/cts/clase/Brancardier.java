package ro.ase.cts.clase;

public class Brancardier extends Personal {

    public Brancardier(String nume, String prenume, int salariu, int aniVechime) {
        super(nume, prenume, salariu, aniVechime);
    }

    @Override
    public void descriereProfilAngajat() {
        StringBuilder builder = new StringBuilder(this.getNumeComplet().toUpperCase());
        builder.append("\n").append("Functie:brancardier").append("\n")
                .append("Salariul: ").append(this.getSalariu()).append(" RON")
                .append("\n").append("Angajat din anul ").append(this.getAnAngajare()).append("(")
                .append(this.getAniVechime()).append( " ani vechime)").append("\n");
        System.out.println(builder.toString());
    }

}
