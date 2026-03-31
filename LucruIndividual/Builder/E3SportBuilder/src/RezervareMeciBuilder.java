public class RezervareMeciBuilder implements Builder{

    private boolean areAccesVIP;
    private boolean ccomentariuAudioLiveInCasti;
    private boolean doresteBauturiGustariRacoritaoare;
    private boolean areAccesLaSesiuneaDeAutograf;

    public RezervareMeciBuilder() {
        this.areAccesVIP = false;
        this.ccomentariuAudioLiveInCasti = false;
        this.doresteBauturiGustariRacoritaoare = false;
        this.areAccesLaSesiuneaDeAutograf = false;
    }

    public RezervareMeciBuilder setAreAccesVIP(boolean areAccesVIP) {
        this.areAccesVIP = areAccesVIP;
        return this;
    }

    public RezervareMeciBuilder setCcomentariuAudioLiveInCasti(boolean ccomentariuAudioLiveInCasti) {
        this.ccomentariuAudioLiveInCasti = ccomentariuAudioLiveInCasti;
        return this;
    }

    public RezervareMeciBuilder setDoresteBauturiGustariRacoritaoare(boolean doresteBauturiGustariRacoritaoare) {
        this.doresteBauturiGustariRacoritaoare = doresteBauturiGustariRacoritaoare;
        return this;
    }

    public RezervareMeciBuilder setAreAccesLaSesiuneaDeAutograf(boolean areAccesLaSesiuneaDeAutograf) {
        this.areAccesLaSesiuneaDeAutograf = areAccesLaSesiuneaDeAutograf;
        return this;
    }

    @Override
    public RezervareMeci build(String numeSuporter) {
        return new RezervareMeci(numeSuporter,this.areAccesVIP,this.ccomentariuAudioLiveInCasti,
                this.doresteBauturiGustariRacoritaoare,this.areAccesLaSesiuneaDeAutograf);
    }
}
