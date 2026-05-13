package clase;

import java.util.ArrayList;
import java.util.List;

public class CompositeUnitateCod implements ICode {
    private String nume;
    private List<ICode> componenteCod;

    public CompositeUnitateCod(String nume) {
        this.nume = nume;
        this.componenteCod = new ArrayList<ICode>();
    }

    @Override
    public void adaugaUnitateCod(ICode unitateCod) {
        this.componenteCod.add(unitateCod);
    }

    @Override
    public void stergeUnitateCod(ICode unitateCod) {
        this.componenteCod.remove(unitateCod);
    }

    @Override
    public void scrieUnitateCod(String aliniat) {
        System.out.println(aliniat+"Se parseaza clasa "+this.nume+"...");
        System.out.println(aliniat+"Componente ale clasei "+this.nume+":");
        for(ICode componenta:this.componenteCod){
            componenta.scrieUnitateCod(aliniat+aliniat);
        }
        System.out.println();
    }

    @Override
    public ICode getUnitateCod(int index) {
        if(index>=0 && index<this.componenteCod.size()){
            return  this.componenteCod.get(index);
        }else{
            throw  new RuntimeException("Ati introdus un index invalid");
        }
    }
}
