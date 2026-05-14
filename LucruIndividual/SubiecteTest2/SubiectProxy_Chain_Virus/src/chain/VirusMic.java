package chain;

public class VirusMic extends AntivirusHandler{

    @Override
    public void handleVirus(int severity) {
        if(severity<=3){
            System.out.println("Virus cu severitate REDUSA detectat "+" Procesul infectat a fost oprit automat.");
        }else{
            super.getSuccesor().handleVirus(severity);
        }
    }
}
