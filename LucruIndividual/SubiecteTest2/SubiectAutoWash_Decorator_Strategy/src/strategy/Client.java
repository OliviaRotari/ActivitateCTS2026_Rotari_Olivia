package strategy;

public class Client {
   private String numeClient;
    private IModPlata modPlata;


    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public  void achitaSpalare(double suma){
        System.out.println("Clientul "+this.numeClient+" efectueaza plata: ");
        this.modPlata.plateste(suma);
    }
}
