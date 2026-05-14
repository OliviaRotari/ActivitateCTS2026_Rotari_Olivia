package clase;

public class Ambulanta extends HandlerAccidentare{

    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        if(accidentare.getGravitate()==TipGravitateAccidentare.GRAVA){
            System.out.println("Ambulanta transporta cursantul " + accidentare.getNumeCursant()
                    + " la spital, fiind grav accidentat!");
        }
    }
}
