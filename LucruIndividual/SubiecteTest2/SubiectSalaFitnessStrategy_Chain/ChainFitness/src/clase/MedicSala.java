package clase;

public class MedicSala extends HandlerAccidentare {

    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        System.out.println("Medicul verifica gravitatea accidentarii cursantului " + accidentare.getNumeCursant());
        if (accidentare.getGravitate()== TipGravitateAccidentare.MEDIE) {
            System.out.println("     -> Medicul trateaza accidentarea...");
        }else{
            if(this.getSuccesor()!=null){
                this.getSuccesor().trateazaAccidentare(accidentare);
            }else{
                System.out.println("Serviciul de ambulanta este prea solicitat in acest moment!");
            }
        }
    }
}
