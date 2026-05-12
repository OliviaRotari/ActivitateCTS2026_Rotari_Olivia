package clase;

public class BiletSarbatoare extends DecoratorBilet {
    private String sarbatoare;

    public BiletSarbatoare(IBilet biletDecorat, String sarbatoare) {
        super(biletDecorat);
        this.sarbatoare = sarbatoare;
    }


    @Override
    public void afiseazaUrare() {
        System.out.println("Cu ocazia zilei de " + this.sarbatoare + " compania va ureaza La multi ani!");
    }

    @Override
    public void descriereBilet() {
        super.descriereBilet();
        this.afiseazaUrare();
    }
}
