public class RezervareMeci {
    private String numeSuporter;
    private boolean areAccesVIP;
    private boolean ccomentariuAudioLiveInCasti;
    private boolean doresteBauturiGustariRacoritaoare;
    private boolean areAccesLaSesiuneaDeAutograf;

    public RezervareMeci(String numeSuporter, boolean areAccesVIP, boolean ccomentariuAudioLiveInCasti, boolean doresteBauturiGustariRacoritaoare, boolean areAccesLaSesiuneaDeAutograf) {
        this.numeSuporter = numeSuporter;
        this.areAccesVIP = areAccesVIP;
        this.ccomentariuAudioLiveInCasti = ccomentariuAudioLiveInCasti;
        this.doresteBauturiGustariRacoritaoare = doresteBauturiGustariRacoritaoare;
        this.areAccesLaSesiuneaDeAutograf = areAccesLaSesiuneaDeAutograf;
    }

    public RezervareMeci() {
    }

    public String decizieOptiuniExtra(boolean optiune) {
        return optiune ? "Da" : "Nu";
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare pentru suporterul: ");
        sb.append(numeSuporter.toUpperCase()).append('\'')
                .append("\n->Acces VIP: ").append(decizieOptiuniExtra(areAccesVIP))
                .append("\n-> Comentarii Audio Live in casti: ").append(decizieOptiuniExtra(ccomentariuAudioLiveInCasti))
                .append("\n-> Gustari si Bauturi Racoritoare: ").append(decizieOptiuniExtra(doresteBauturiGustariRacoritaoare))
                .append("\n-> Acces la sesiunea de autografe la finalul meciului: ").append(decizieOptiuniExtra(areAccesLaSesiuneaDeAutograf))
                .append("\n");
        return sb.toString();
    }
}
