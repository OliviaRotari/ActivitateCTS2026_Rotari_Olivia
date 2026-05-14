package observer;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume+", ai primit urmatoarea ntificare:\n\t"+mesaj);
    }
}
