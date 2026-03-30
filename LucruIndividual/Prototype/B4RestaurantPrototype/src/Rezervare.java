public class Rezervare implements IRezervare{

    private  String nume;
    private int nrPersoane;
    private String nrTelefon;

    public Rezervare() {
    }

    public Rezervare(String nume, int nrPersoane, String nrTelefon) {
       super();
       this.nume=nume;
       if(nrPersoane<1){
           throw new IllegalArgumentException();
       }
       this.nrPersoane=nrPersoane;
       if(nrTelefon.length()<13){
           throw new IllegalArgumentException();
       }
       if(!nrTelefon.startsWith("0040")){
           throw  new IllegalArgumentException();
       }
       this.nrTelefon=nrTelefon;
    }
    //adaugam setari ca sa modificam clona in apel, dar se respecta prototype, dar nu clean code


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
        if(nrTelefon.length()<13){
            throw new IllegalArgumentException();
        }
    }

    public void setNrTelefon(String nrTelefon) {
        if(nrTelefon.length()<13) {
            throw new IllegalArgumentException();
        }
        if(!nrTelefon.startsWith("0040")) {
            throw new IllegalArgumentException();
        }
        this.nrTelefon=nrTelefon;
    }

    @Override
    public IRezervare copiaza() {
       Rezervare rezervare=new Rezervare();
       rezervare.nrPersoane=this.nrPersoane;
       rezervare.nrTelefon=this.nrTelefon;
       rezervare.nume=this.nume;
       return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
