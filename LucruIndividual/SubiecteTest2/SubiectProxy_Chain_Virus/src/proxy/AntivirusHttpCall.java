package proxy;

public class AntivirusHttpCall implements IHttpCall{
    @Override
    public String get(String url) {
        return "Conexiunea catre "+url+" a fost realizata cu succes";
    }

    @Override
    public boolean ping(String url) {
        System.out.println("Ping realizat cu suuces catre "+url);
        return true;
    }
}
