package adapter;

public class AdapterBicicleta implements IPachetTuristic{
    private BiciletElectrica biciletElectrica;

    public AdapterBicicleta(BiciletElectrica biciletElectrica) {
        this.biciletElectrica = biciletElectrica;
    }

    @Override
    public void descriePachet() {
        System.out.println(biciletElectrica.toString());
    }

    @Override
    public void rezervaPachet() {
       biciletElectrica.inchiriataBicicle();
    }

    @Override
    public void vindePachet() {
        biciletElectrica.achitaCursa();
    }
}
