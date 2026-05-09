package clase;

public class ContCredit extends HandlerPlata {
    public ContCredit(double sold) {
        super(sold);
    }

    @Override
    public void gestioneazaPlata(double sumaSolicitata) {
        if (verificaSold(sumaSolicitata)) {
            System.out.println("Ati facut o plata in valoare de " + sumaSolicitata + " Ron din  contul de credit");
            this.actualizeazaSold(sumaSolicitata);
            System.out.println("Sold ramas: " + this.getSold());
        } else {
            System.out.println("Plata refuzata, fonduri insuficiente! " + this.getSold() + " RON");
        }
    }
}