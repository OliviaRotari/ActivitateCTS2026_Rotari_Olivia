package ro.ase.cts.clase;

public class InternareBuildertAlternativ implements InternareBuilderAbstractAlternativ {

    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciDeCamera;
    private boolean halatPentruInterior;


    public InternareBuildertAlternativ() {
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
        this.halatPentruInterior = false;

    }

    public InternareBuildertAlternativ setPat(boolean arePatRabatabil) {
        patRabatabil = arePatRabatabil;
        return this;
    }

    public InternareBuildertAlternativ setMicDejun(boolean areMicDejun) {
        micDejunInclus = areMicDejun;
        return this;
    }

    public InternareBuildertAlternativ setPapuciDeCamera(boolean arePapuciDeCamera) {
        papuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public InternareBuildertAlternativ setHalatDeBaie(boolean areHalatDeBaie) {
        halatPentruInterior = areHalatDeBaie;
        return this;
    }


    @Override
    public Internare build(String nume) {
        Internare internare = new Internare(this.patRabatabil, this.micDejunInclus, this.papuciDeCamera, this.halatPentruInterior, nume);
        return internare;
    }
}