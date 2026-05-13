package clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeSectiune implements IComponentaGrupare {
    private String denumire;
    private List<IComponentaGrupare> componente;

    public CompositeSectiune(String denumire) {
        this.denumire = denumire;
        this.componente = new ArrayList<IComponentaGrupare>();
    }


    @Override
    public void descrieComponenta(String aliniat) {
        System.out.println(aliniat + "Medicamente " + this.denumire + ":");
        for (IComponentaGrupare componenta : this.componente) {
componenta.descrieComponenta(aliniat+aliniat);
        }
    }

    @Override
    public void adaugaComponenta(IComponentaGrupare componenta) {
        this.componente.add(componenta);
    }

    @Override
    public void stergeComponenta(IComponentaGrupare componenta) {
        this.componente.remove(componenta);
    }
}
