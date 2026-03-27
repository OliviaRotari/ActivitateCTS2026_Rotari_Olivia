package SingletonProbleme.AgentieSingletonThreadSafe;

public class Agentie {
    private String nume;
    private String adresa;
    private int nrPacheteDisponibile;

    private static Agentie instanta=null;//instanta unica -lazy initialization

    //constructor privat
    private Agentie(String nume, String adresa, int nrPacheteDisponibile) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrPacheteDisponibile = nrPacheteDisponibile;
    }

    //thread safe
    public static synchronized Agentie getInstance(String nume, String adresa, int nrPacheteDisponibile){
        if(instanta==null){
            instanta=new Agentie(nume,adresa,nrPacheteDisponibile);
        }
        return instanta;
    }

    //metoda vinde pachete

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", nrPacheteDisponibile=").append(nrPacheteDisponibile);
        sb.append('}');
        return sb.toString();
    }

    public void vindePachet(){
        if(nrPacheteDisponibile>0) {
            nrPacheteDisponibile--;
            System.out.println("Pachet vandut");
        }else{
            System.out.println("Nu mai sunt pahete disponibile!");
        }


    }
}
