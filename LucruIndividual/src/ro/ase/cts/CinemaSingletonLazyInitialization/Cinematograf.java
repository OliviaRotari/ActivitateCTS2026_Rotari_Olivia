package ro.ase.cts.CinemaSingletonLazyInitialization;

import com.sun.source.doctree.EscapeTree;

import java.util.Objects;

public class Cinematograf {
    private static Cinematograf instance=null;
    private String nume;
    private String adresa;
    private int nrSali;

    public int getNrSali() {
        return nrSali;
    }

    public void setNrSali(int nrSali) {
        this.nrSali = nrSali;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    private Cinematograf(int nrSali) {
        nume="Cinematograf Tandarica";
        adresa="Romania";
        this.nrSali=nrSali;
    }

    public static Cinematograf getInstance(int nrSali) {
        if(instance==null){
            instance=new Cinematograf(nrSali);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Cinematograf[ nume= "+nume+", adresa= "+adresa+", nr_Sali= "+nrSali+"]";
    }
}
