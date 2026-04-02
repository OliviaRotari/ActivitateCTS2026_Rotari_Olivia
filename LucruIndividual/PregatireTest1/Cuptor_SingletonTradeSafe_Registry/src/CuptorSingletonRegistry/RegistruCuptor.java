package CuptorSingletonRegistry;

import java.util.HashMap;
import java.util.Map;

public class RegistruCuptor {
    private String denumireRestaurant;
    private String locatie;

    private static RegistruCuptor instanta=null;
    private Map<String,Cuptor> registru=new HashMap<>();

    private RegistruCuptor(String denumireRestaurant, String locatie) {
        this.denumireRestaurant = denumireRestaurant;
        this.locatie = locatie;
    }

    public static synchronized RegistruCuptor getInstanta(String denumireRestaurant,String locatie) {
       if(instanta==null){
           instanta=new RegistruCuptor(denumireRestaurant, locatie);
       }
        return instanta;
    }

    public Cuptor adaugaCuptor(String codCuptor, int temperaturaMaxima){
        if(!registru.containsKey(codCuptor)){
            registru.put(codCuptor,new Cuptor(codCuptor,temperaturaMaxima));
        }
        return registru.get(codCuptor);
    }

    public void asigneazaComandaOptima(ComandaRestaurant comanda){
        Cuptor cuptorOptim=null;
        int timpMinim=Integer.MAX_VALUE;

        for(Cuptor cuptor:registru.values()){
            if(comanda.getPreparat().getTemperaturaNecesara()<=cuptor.getTemperaturaMaxima()){
                int timpCurent=cuptor.calculeazaTimpTotalDeAsteptare();
                if(timpCurent<timpMinim){
                    timpMinim=timpCurent;
                    cuptorOptim=cuptor;
                }
            }

            if (cuptorOptim != null) {
                cuptorOptim.adaugaComanda(comanda);
                System.out.println("Comanda " + comanda.getIdComanda() +
                        " a fost asignata optim la " + cuptorOptim.getCodCuptor() +
                        " pentru minimizarea timpului de asteptare.");
            } else {
                System.out.println("Comanda " + comanda.getIdComanda() +
                        " NU poate fi asignata. Niciun cuptor nu suporta " +
                        comanda.getPreparat().getTemperaturaNecesara() + " grade.");
            }
        }
    }

    public  void afiseazaToateCuptoarele(){
        System.out.println("=======Situatia tuturor cuptoarelor in restaurant=====");
        System.out.println("Restaurant: "+denumireRestaurant+" |Locatie: "+locatie);
        for(Cuptor c:registru.values()){
            c.afiseazaComenziInAsteptare();
        }
    }


}
