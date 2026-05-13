package clase;

public class VetificareAmericani implements IVerificareActe{

    @Override
    public void verificaActe(String numeClient) {
        System.out.println(numeClient + ", va rog sa prezentati viza pentru a fi scanata, conform protocolului de cazare a clientilor americani");
    }
}
