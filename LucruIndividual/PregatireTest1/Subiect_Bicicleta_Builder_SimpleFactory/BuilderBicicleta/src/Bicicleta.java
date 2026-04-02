public class Bicicleta implements IBicicleta {
    private final float diametruRoti;
    private final float pret;
    private final TipFrana tipFrana;
    private final boolean areCascaProtectie;
    private final boolean areOchelari;
    private final boolean areCotiere;
    private final boolean areGenunchere;

    public Bicicleta(float diametruRoti, float pret, TipFrana tipFrana, boolean areCascaProtectie, boolean areOchelari, boolean areCotiere, boolean areGenunchere) {
        this.diametruRoti = diametruRoti;
        this.pret = pret;
        this.tipFrana = tipFrana;
        this.areCascaProtectie = areCascaProtectie;
        this.areOchelari = areOchelari;
        this.areCotiere = areCotiere;
        this.areGenunchere = areGenunchere;
    }

    private String decizieOptiuneExtra(boolean optiune) {
        return optiune ? "Da" : "Nu";
    }

    @Override
    public void descriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tDiametru Roti: ").append(this.diametruRoti).append(" cm")
                .append("\n\t Pret:").append(this.pret).append(" RON")
                .append("\n\t Tip Frana:").append(this.tipFrana)
                .append("\n\tCasca de Protectie inclusa: ").append(decizieOptiuneExtra(this.areCascaProtectie))
                .append("\\n\\tOchelari inclusi: ").append(decizieOptiuneExtra(this.areOchelari))
                .append("\n\tCotiere incluse: ").append(decizieOptiuneExtra(this.areCotiere))
                .append("\n\tGenunchiere incluse: ").append(decizieOptiuneExtra(this.areGenunchere)).append("\n");
        System.out.println(sb.toString());
    }


}
