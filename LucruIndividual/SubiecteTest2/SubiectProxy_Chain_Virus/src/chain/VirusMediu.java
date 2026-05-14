package chain;

public class VirusMediu extends AntivirusHandler{
    @Override
    public void handleVirus(int severity) {
        if(severity>3&&severity<=7){
            System.out.println("A fost detectat virul Mediu ,Procesul principal continua executia in paralel");
        }else{
            super.getSuccesor().handleVirus(severity);
        }
    }
}
