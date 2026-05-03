package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
    private String numeDep;
    private List<Structura> subStructuri;

    public Departament(String numeDep) {
        this.numeDep = numeDep;
        this.subStructuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura) {
        subStructuri.add(structura);
    }

    public void stergeStructura(Structura structura) {
        subStructuri.remove(structura);
    }

    public Structura getStructura(int pozitie) {
        return subStructuri.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Nume Departament: " + this.numeDep);
        for (Structura structura : subStructuri) {
            structura.afiseazaDetaliiStructura(spatii + "   ");
        }
    }
}