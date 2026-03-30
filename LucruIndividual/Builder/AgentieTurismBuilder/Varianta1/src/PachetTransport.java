public class PachetTransport {
    private boolean areWifi;
    private boolean areAnimale;
    private boolean esteFumator;
    private boolean areAC;
    private boolean areTV;

    public PachetTransport(boolean areWifi, boolean areAnimale, boolean esteFumator, boolean areAC, boolean areTV) {
        super();
        this.areWifi = areWifi;
        this.areAnimale = areAnimale;
        this.esteFumator = esteFumator;
        this.areAC = areAC;
        this.areTV = areTV;
    }

    public boolean esteAreWifi() {
        return areWifi;
    }

    public void setAreWifi(boolean areWifi) {
        this.areWifi = areWifi;
    }

    public boolean esteAreAnimale() {
        return areAnimale;
    }

    public void setAreAnimale(boolean areAnimale) {
        this.areAnimale = areAnimale;
    }

    public boolean esteFumator() {
        return esteFumator;
    }

    public void setEsteFumator(boolean esteFumator) {
        this.esteFumator = esteFumator;
    }

    public boolean areAreAC() {
        return areAC;
    }

    public void setAreAC(boolean areAC) {
        this.areAC = areAC;
    }

    public boolean esteAreTV() {
        return areTV;
    }

    public void setAreTV(boolean areTV) {
        this.areTV = areTV;
    }

    @Override
    public String toString() {
        return "  PachetTransport [areWifi=" + areWifi +
                ", areAnimale=" + areAnimale +
                ", esteFumator=" + esteFumator +
                ", areAC=" + areAC + ", areTV=" + areTV + " ]";
    }
}
