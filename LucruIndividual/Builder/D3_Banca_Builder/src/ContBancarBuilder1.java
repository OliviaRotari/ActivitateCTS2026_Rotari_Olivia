public class ContBancarBuilder1 implements IBuilder {

    private ContBancar contBancar;

    public ContBancarBuilder1() {
        contBancar = new ContBancar();
    }


    public ContBancarBuilder1 setDestinatar(String destinatar) {
        contBancar.setDestinatar(destinatar);
        return this;
    }

    public ContBancarBuilder1 setSumaBlocata(double sumaBlocata) {
        contBancar.setSumaBlocata(sumaBlocata);
        return this;
    }

    public ContBancarBuilder1 setSuma(double suma) {
        contBancar.setSuma(suma);
        return this;
    }

    public ContBancarBuilder1 setMoneda(String moneda) {
        contBancar.setMoneda(moneda);
        return this;
    }

    public ContBancarBuilder1 setCardAtasat(boolean cardAtasat) {
        contBancar.setCardAtasat(cardAtasat);
        return this;
    }

    public ContBancarBuilder1 setInternetBanking(boolean internetBanking) {
        contBancar.setInternetBanking(internetBanking);
        return this;
    }

    public ContBancarBuilder1 setContSalariu(boolean contSalariu) {
        contBancar.setContSalariu(contSalariu);
        return this;
    }

    @Override
    public ContBancar build() {
        return contBancar;
    }
}
