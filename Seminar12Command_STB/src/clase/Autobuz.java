package clase;

public class Autobuz {
    private String producator;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void incepeTraseul(int nrLinie) {
        System.out.println("Autobuzul marca " + this.producator + " incepe traseul pe linia " + nrLinie);
    }
}