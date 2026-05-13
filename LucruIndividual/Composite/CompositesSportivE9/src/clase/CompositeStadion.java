package clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeStadion implements IStructuraStadion {
    private String denumire;
    private List<IStructuraStadion> elemente;

    public CompositeStadion(String denumire) {
        this.denumire = denumire;
        this.elemente = new ArrayList<IStructuraStadion>();
    }


    @Override
    public void adaugaElement(IStructuraStadion element) {
        this.elemente.add(element);
    }

    @Override
    public void stergeElement(IStructuraStadion element) {
        this.elemente.remove(element);
    }

    @Override
    public void descrieElement(String aliniat) {
        System.out.println(aliniat + denumire);
        for (IStructuraStadion element : elemente) {
            element.descrieElement(aliniat + aliniat);
        }
    }
}
