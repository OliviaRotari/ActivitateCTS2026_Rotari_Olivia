public class Sala {
    private int nrSala;
    private boolean luminaAprina;
    private boolean usaDeschisa;
    private String filmDifuzat;

    public int getNrSala() {
        return nrSala;
    }

    public void setNrSala(int nrSala) {
        this.nrSala = nrSala;
    }

    public boolean esteLuminaAprina() {
        return luminaAprina;
    }

    public void setLuminaAprina(boolean luminaAprina) {
        this.luminaAprina = luminaAprina;
    }

    public boolean esteUsaDeschisa() {
        return usaDeschisa;
    }

    public void setUsaDeschisa(boolean usaDeschisa) {
        this.usaDeschisa = usaDeschisa;
    }

    public String getFilmDifuzat() {
        return filmDifuzat;
    }

    public void setFilmDifuzat(String filmDifuzat) {
        this.filmDifuzat = filmDifuzat;
    }

    public Sala(int nrSala, boolean luminaAprina, boolean usaDeschisa, String filmDifuzat) {
        this.nrSala = nrSala;
        this.luminaAprina = luminaAprina;
        this.usaDeschisa = usaDeschisa;
        this.filmDifuzat = filmDifuzat;
    }

    public Sala() {
        this.nrSala = 8;
        this.luminaAprina = true;
        this.usaDeschisa = true;
        this.filmDifuzat = "Titanic";
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sala{");
        sb.append("nrSala=").append(nrSala);
        sb.append(", luminaAprina=").append(luminaAprina);
        sb.append(", usaDeschisa=").append(usaDeschisa);
        sb.append(", filmDifuzat='").append(filmDifuzat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
