package program;

import clase.Facade;

public class Main {
    public static void main(String[] args) {
        Facade rezervareSejur=new Facade();
        rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Istanbul");
    }
}
