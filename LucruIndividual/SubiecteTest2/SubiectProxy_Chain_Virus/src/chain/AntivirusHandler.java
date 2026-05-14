package chain;

public abstract class AntivirusHandler implements IVirusHandler{
    private AntivirusHandler succesor;

    public AntivirusHandler getSuccesor() {
        return succesor;
    }

    public void setSuccesor(AntivirusHandler succesor) {
        this.succesor = succesor;
    }
}
