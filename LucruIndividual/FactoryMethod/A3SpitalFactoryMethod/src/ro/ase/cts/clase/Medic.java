package ro.ase.cts.clase;

import java.lang.ref.SoftReference;

public class Medic extends APersonal{
    private String specializare;
    public Medic(String nume, String prenume, int salariu, int aniVechime,String specializare) {
        super(nume, prenume, salariu, aniVechime);
        this.specializare=specializare;
    }

    @Override
    public void descriereProfilAngajare() {
        StringBuilder sb =new StringBuilder(this.getNumeComplet().toUpperCase());
        sb.append("\n").append("Functie: MEDIC ").append(specializare).append("\n")
                .append("Salariul: ").append(this.getSalariu()).append(" RON").append("\n")
                .append("Angajat din anul: ").append(this.getAnAngajare()).append(" ( ")
                .append(this.getAniVechime()).append(" ani vechime)");
        System.out.println(sb.toString());
    }
}
