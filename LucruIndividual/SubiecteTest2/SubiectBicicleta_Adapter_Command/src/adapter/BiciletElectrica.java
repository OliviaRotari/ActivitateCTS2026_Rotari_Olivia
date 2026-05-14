package adapter;

import java.util.StringJoiner;

public class BiciletElectrica {
    private String model;

    public BiciletElectrica(String model) {
        this.model = model;
    }

    public  void inchiriataBicicle(){
        System.out.println("BICICLETA ELECTRICA: "+model+" a fost inchiriata");
    }

    public void achitaCursa(){
        System.out.println("Cursa pt BICICLETA ELECTRICA: "+model+" a fost inchiriata");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BiciletElectrica{");
        sb.append("model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
