package clase;

public class AsistentMedical extends HandlerAccidentare {
    @Override
    public void trateazaAccidentare(FisaAccidentare accidentare) {
        System.out.println("Asistentul medical verifica gravitatea situatiei...");
        if (accidentare.getGravitate() == TipGravitateAccidentare.USOARA) {
            System.out.println("     -> Asistentul medical trateaza accidentarea...");
        } else {
            if (this.getSuccesor() != null) {
                this.getSuccesor().trateazaAccidentare(accidentare);
            } else {
                System.out.println("Nu avem medic care sa evalueze si sa trateze accidentarea cursantului "
                        + accidentare.getGravitate() + "!");
            }
        }
    }
}
