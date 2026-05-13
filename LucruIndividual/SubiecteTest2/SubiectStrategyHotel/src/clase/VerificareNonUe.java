package clase;

public class VerificareNonUe implements IVerificareActe {


    @Override
    public void verificaActe(String numeClient) {
        System.out.println(numeClient + ", va rog sa prezentati pasaportul pentru a fi scanat, conform protocolului de cazare a clientilor europeni non-UE.");
    }
}
