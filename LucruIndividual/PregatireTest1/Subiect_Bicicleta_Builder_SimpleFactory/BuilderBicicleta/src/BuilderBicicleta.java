public class BuilderBicicleta implements AbstractBuilder {
    private float diametruRoti;
    private  float pret;
    private  TipFrana tipFrana;
    private  boolean areCascaProtectie;
    private  boolean areOchelari;
    private  boolean areCotiere;
    private  boolean areGenunchere;

    public BuilderBicicleta() {
        this.diametruRoti = 10;
        this.pret = 0;
        this.tipFrana = TipFrana.NICIUNA;
        this.areCascaProtectie = false;
        this.areOchelari = false;
        this.areCotiere = false;
        this.areGenunchere = false;
    }

    public BuilderBicicleta setDiametruRoti(float diametruRoti) {
        this.diametruRoti = diametruRoti;
        return this;
    }

    public  BuilderBicicleta setPret(float pret) {
        this.pret = pret;
        return this;
    }

    public BuilderBicicleta setTipFrana(TipFrana tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public BuilderBicicleta setAreCascaProtectie(boolean areCascaProtectie) {
        this.areCascaProtectie = areCascaProtectie;
        return this;
    }

    public BuilderBicicleta setAreOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }

    public BuilderBicicleta setAreCotiere(boolean areCotiere) {
        this.areCotiere = areCotiere;
        return this;
    }

    public BuilderBicicleta setAreGenunchere(boolean areGenunchere) {
        this.areGenunchere = areGenunchere;
        return this;
    }

    @Override
    public IBicicleta buildBicicleta() {
        return new Bicicleta(this.diametruRoti,this.pret,this.tipFrana,this.areCascaProtectie,this.areOchelari,this.areCotiere,this.areGenunchere);
    }
}
