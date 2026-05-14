package strategy;

public class PlataCash implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a realizat plata cu cash pentru suma de "+suma);
    }
}
