package clase;

public abstract class HandlerAccidentare {

    private HandlerAccidentare succesor;

    public void setSuccesor(HandlerAccidentare succesor) {
        this.succesor = succesor;
    }

    public HandlerAccidentare getSuccesor() {
        return succesor;
    }

    public abstract void trateazaAccidentare(FisaAccidentare accidentare);
}
