package clase;

public class ProxyContract implements IContract{
private Contract contract=null;
private String tipContract=null;
private String numeClient=null;

    public ProxyContract(String numeClient, String tipContract) {
        this.numeClient = numeClient;
        this.tipContract = tipContract;
    }

    @Override
    public void multiplicareContract() {
        if(contract==null){
            contract=new Contract(tipContract,numeClient);
        }
     contract.multiplicareContract();
    }
}
