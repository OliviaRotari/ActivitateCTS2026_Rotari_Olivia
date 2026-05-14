package strategy;

public class PlataTelefon implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu telefonul pentru suma de "+suma);
    }
}
