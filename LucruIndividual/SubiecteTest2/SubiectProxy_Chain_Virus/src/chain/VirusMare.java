package chain;

public class VirusMare extends AntivirusHandler{
    @Override
    public void handleVirus(int severity) {
        if(severity>7){
            System.out.println("A fost detectat un virus Mare "
                    +"Antivirusul izoleaza complet procesul infectat");
        }
    }
}
