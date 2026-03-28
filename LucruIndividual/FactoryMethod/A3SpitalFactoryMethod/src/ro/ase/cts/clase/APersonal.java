package ro.ase.cts.clase;

import java.time.LocalDate;
import java.util.Locale;
import java.util.SplittableRandom;

public abstract class APersonal {
    private String nume;
    private String prenume;
    private  int salariu;
    private int aniVechime;

    public APersonal(String nume, String prenume, int salariu, int aniVechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.salariu = salariu;
        this.aniVechime = aniVechime;
    }

    public String getNumeComplet(){
        return nume+" "+prenume;
    }

    public int getAnAngajare(){
       return LocalDate.now().getYear()-aniVechime;
    }

    public int getSalariu(){
        return salariu;
    }

    public int getAniVechime(){
        return aniVechime;
    }

    public abstract void descriereProfilAngajare();
}
