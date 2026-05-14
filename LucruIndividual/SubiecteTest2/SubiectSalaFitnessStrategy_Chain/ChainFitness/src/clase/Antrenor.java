package clase;

public class Antrenor extends HandlerAccidentare{

    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        System.out.println("Antrenorul verifica situatia...");
        if(accidentare!=null){
            if(this.getSuccesor()!=null){
                this.getSuccesor().trateazaAccidentare(accidentare);
            }else{
                System.out.println("Nu avem asistent medical ca sa trateze accidentarea");
            }
        }else{
            System.out.println("Alarma falsa! Nu este vorba de nici o accidentare!");
        }
    }
}
