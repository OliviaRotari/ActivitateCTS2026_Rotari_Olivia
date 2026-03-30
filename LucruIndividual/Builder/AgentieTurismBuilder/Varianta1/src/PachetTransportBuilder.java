public class PachetTransportBuilder implements Builder {

    private PachetTransport pachetTransport;

    public PachetTransportBuilder() {
        pachetTransport = new PachetTransport(false, false, false, false, false);
    }

    @Override
    public PachetTransport build() {
        return pachetTransport;
    }

    public PachetTransportBuilder setAreWifi(boolean areWifi) {
        pachetTransport.setAreWifi(areWifi);
        return this;
    }

    public PachetTransportBuilder setAreAnimale(boolean areAnimale) {
        pachetTransport.setAreAnimale(areAnimale);
        return this;
    }

    public PachetTransportBuilder setEsteFumator(boolean esteFumator) {
        this.pachetTransport.setEsteFumator(esteFumator);
        return this;
    }

    public PachetTransportBuilder setAreTv(boolean areTv) {
        this.pachetTransport.setAreTV(areTv);
        return this;
    }

    public PachetTransportBuilder setAreAC(boolean areAC) {
        this.pachetTransport.setAreAC(areAC);
        return this;
    }


}
