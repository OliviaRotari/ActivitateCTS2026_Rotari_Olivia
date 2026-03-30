package ro.ase.cts;

import java.util.ArrayList;
import java.util.Objects;

public abstract class ContractAsigurare implements Cloneable {
    private String id;

    protected  String tip;
    protected ArrayList<Object> clauzaContractuale;

    abstract void prinatre();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTip() {
        return tip;
    }

    public ArrayList<Object> getClauzaContractuale() {
        return clauzaContractuale;
    }

    @Override
    protected Object clone(){
        Object clone =null;
        try{
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "ContractAsigurare [id="+id+", tip="+tip+"]";
    }
}
