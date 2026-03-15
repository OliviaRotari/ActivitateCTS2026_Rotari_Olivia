package ro.ase.cts.clase;

public class InternareBuilder implements InternareBuilderAbstract {
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(false, false, false, false, nume);
    }

    //setari de tipul clasei //setari publici
    public InternareBuilder setPat(boolean arePatRabatabil) {
        internare.patRabatabil = arePatRabatabil;
        return this;
    }

    public InternareBuilder setMicDejun(boolean areMicDejun) {
        internare.micDejunInclus = areMicDejun;
        return this;
    }

    public InternareBuilder setPapuciDeCamera(boolean arePapuciDeCamera) {
        internare.papuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public InternareBuilder setHalatDeBaie(boolean areHalatDeBaie) {
        internare.halatPentruInterior = areHalatDeBaie;
        return this;
    }

    public InternareBuilder setNume(String nume) {
        internare.numePacient = nume;
        return this;
    }


    @Override
    public Internare build() {
        return internare;
    }
}