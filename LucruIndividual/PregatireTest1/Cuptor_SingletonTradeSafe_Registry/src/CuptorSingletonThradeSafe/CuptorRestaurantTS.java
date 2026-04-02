package CuptorSingletonThradeSafe;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CuptorRestaurantTS {
    private String denumireCutor;
    private int temeraturaMaxim;
    private List<ComandaPreparat> listaAsteptare;

    private  static CuptorRestaurantTS instanta=null;

    private CuptorRestaurantTS(String denumireCutor, int temeraturaMaxim) {
        this.denumireCutor = denumireCutor;
        this.temeraturaMaxim = temeraturaMaxim;
        this.listaAsteptare = new ArrayList<>();
    }

    public synchronized static CuptorRestaurantTS getInstanta(String denumireCutor,int temeraturaMaxim) {
        if(instanta==null){
            instanta=new CuptorRestaurantTS(denumireCutor,temeraturaMaxim);
        }
        return instanta;
    }

    public void adaugaComandaInAsteptare(ComandaPreparat comanda){
       if(comanda.getPreparat().getTemperaturaNecesara()<=this.temeraturaMaxim){
           listaAsteptare.add(comanda);
        System.out.println("Comanda "+comanda.getIdComanda()+"a fost adaugata in lista de asteptare a cuptorului unic");
       }else{
           System.out.println("Comanda "+comanda.getIdComanda()+" nu poate fi facut.Prepratul necesita "+
                   comanda.getPreparat().getTemperaturaNecesara()+" grade, iar cuptorul suporta maxim"+this.temeraturaMaxim);
       }
    }

    public void afiseazaListaAsteptare(){
        System.out.println("\n====LISTA DE ASTEPTARE AC CUPTORULUI UNIC");
        System.out.println("Cuptor: "+denumireCutor+" |Temoperatura maxima "+temeraturaMaxim+" grade");
        if(listaAsteptare.isEmpty()){
            System.out.println("Nu exista prepaarate in astepare");
        }else{
            for(ComandaPreparat comanda:listaAsteptare){
                System.out.println("Comanda: "+comanda.getIdComanda()+" preparat"+comanda.getPreparat().getDenumire()+" |timp: "+
                        comanda.getPreparat().getTimpGatireMinute()+", temperatura:"+comanda.getPreparat().getTemperaturaNecesara()+" grade\n");
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuptorRestaurantTS{");
        sb.append("denumireCutor='").append(denumireCutor).append('\'');
        sb.append(", temeraturaMaxim=").append(temeraturaMaxim);
        sb.append(", numarComenziAsteptare=").append(listaAsteptare.size());
        sb.append('}');
        return sb.toString();
    }
}

