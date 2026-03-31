public class FacturaBuilder implements Builder{
    private int nrPungi;
    private boolean platesteCuCardul;
    private  boolean areCardDeFidelitate;
    private int cotaTVA;


    public FacturaBuilder() {
        this.nrPungi=0;
        this.platesteCuCardul=false;
        this.areCardDeFidelitate=false;
        this.cotaTVA=0;
    }

    public FacturaBuilder setNrPungi(int nrPungi) {
      this.nrPungi=nrPungi;
        return  this;
    }

    public FacturaBuilder setPlatesteCuCardul(boolean platesteCuCardul) {
        this.platesteCuCardul = platesteCuCardul;
        return this;
    }

    public FacturaBuilder setAreCardDeFidelitate(boolean areCardDeFidelitate) {
        this.areCardDeFidelitate = areCardDeFidelitate;
        return this;
     }

    public FacturaBuilder setCotaTVA(int cotaTVA) {
        this.cotaTVA = cotaTVA;
        return this;
    }


    @Override
    public Factura build(String idFactura, String numeClient) {
        return new Factura(idFactura,numeClient,this.nrPungi,this.platesteCuCardul,
                this.areCardDeFidelitate,this.cotaTVA);
    }
}
