package CuptorSingletonRegistry;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private String codCuptor;
    private int temperaturaMaxima;
    private List<ComandaRestaurant> comenziInAsteptare;

    public Cuptor(String denumireCuptor, int temperaturaMaxima) {
        this.codCuptor = denumireCuptor;
        this.temperaturaMaxima = temperaturaMaxima;
        this.comenziInAsteptare = new ArrayList<>();
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public String getCodCuptor() {
        return codCuptor;
    }

    public void adaugaComanda(ComandaRestaurant comanda){
        comenziInAsteptare.add(comanda);
    }

    public int calculeazaTimpTotalDeAsteptare(){
        int total=0;
        for(ComandaRestaurant comanda:comenziInAsteptare){
            total+=comanda.getPreparat().getTimpDeGatire();
        }
        return total;
    }

    public void afiseazaComenziInAsteptare(){
        System.out.println("\nCuptor: "+codCuptor+
                " | tempretarura maxima: "+temperaturaMaxima+
                " |timp total de asteptare: "+ calculeazaTimpTotalDeAsteptare());
        if(comenziInAsteptare.isEmpty()){
            System.out.println("Nu exista comenzi in asteptare");
        }else{
            for(ComandaRestaurant comanda:comenziInAsteptare){
                System.out.println("Comanda #:"+comanda.getIdComanda()+
                        " preparat:"+comanda.getPreparat().getDenumire()+
                        ", timp de gatire:"+comanda.getPreparat().getTimpDeGatire()
                +", temperatura necesara: "+comanda.getPreparat().getTemperaturaNecesara()+"\n");
            }
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("codCuptor='").append(codCuptor).append('\'');
        sb.append(", temperaturaMaxima=").append(temperaturaMaxima);
        sb.append(", timp total de asteptare: "+calculeazaTimpTotalDeAsteptare());
        sb.append('}');
        return sb.toString();
    }
}
