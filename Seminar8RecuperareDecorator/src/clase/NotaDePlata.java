package clase;

public class NotaDePlata implements NotaDePlataAbstract {
    public Float suma;
    public String data;

    public NotaDePlata(Float suma, String data) {
        this.suma = suma;
        this.data = data;
    }

    @Override
    public void printeaza() {
        System.out.println("\nLa data " + data + " a fost platit " + suma + " lei ");
    }
}