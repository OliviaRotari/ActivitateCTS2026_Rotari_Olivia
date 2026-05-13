package clase;

public class Client {
    private String numeClient;
    private IVerificareActe verificareActe;

    public Client(String numeClient, IVerificareActe verificareActe) {
        this.numeClient = numeClient;
        this.verificareActe = verificareActe;
    }

    public void setVerificareActe(IVerificareActe verificareActe) {
        this.verificareActe = verificareActe;
    }

    public void prezintaActe() {
        this.verificareActe.verificaActe(this.numeClient);
    }
}