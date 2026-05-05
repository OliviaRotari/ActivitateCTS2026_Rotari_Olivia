package clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi;

    public Operator() {
        this.listaComenzi = new ArrayList<>();
    }

    public void inregistreaza(Command comanda) {
        listaComenzi.add(comanda);
    }

    public void executaFISA() {
        if (listaComenzi.size() > 0) {
            listaComenzi.get(0).executa();
            listaComenzi.removeFirst();
        } else {
            System.out.println("Nu exista Fise ");
        }

    }
}