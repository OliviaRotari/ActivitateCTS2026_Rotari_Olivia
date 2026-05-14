package proxy;

public interface IHttpCall {
    String get(String url);
    boolean ping(String url);
}
