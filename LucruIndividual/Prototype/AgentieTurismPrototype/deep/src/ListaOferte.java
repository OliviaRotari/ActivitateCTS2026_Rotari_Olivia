import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListaOferte implements IListaOferte {

    private List<String> oferte;

    public void setOferte(List<String> oferte) {
        this.oferte = oferte;
    }

    public ListaOferte() {
        oferte = new ArrayList<String>();
    }

    @Override
    public IListaOferte copiaza() {
        ListaOferte listaOferte=new ListaOferte();
        List<String> listaTemporara=new ArrayList<String>();
        for(String oferta:this.oferte){
            listaTemporara.add(oferta);
        }
        listaOferte.setOferte(listaTemporara);
        return listaOferte;
    }

    @Override
    public void incarcareListaOferte() {
        try{BufferedReader reader = new BufferedReader(new FileReader("C:\\ActivitateCTS2026_Rotari_Olivia\\ActivitateCTS2026_Rotari_Olivia\\LucruIndividual\\Prototype\\AgentieTurismPrototype\\deep\\src\\oferte.txt"));
        String oferta = null;

            while ((oferta = reader.readLine()) != null) {
                oferte.add(oferta);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
