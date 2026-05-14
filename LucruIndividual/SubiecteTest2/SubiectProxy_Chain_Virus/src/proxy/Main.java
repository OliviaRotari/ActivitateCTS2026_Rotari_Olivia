package proxy;

public class Main {
    public static void main(String[] args) {
        IHttpCall cautare1=new ProxyAntivirus(new AntivirusHttpCall());
        IHttpCall cautare2=new ProxyAntivirus(new AntivirusHttpCall());
        IHttpCall cautare3=new ProxyAntivirus(new AntivirusHttpCall());
        IHttpCall cautare4=new ProxyAntivirus(new AntivirusHttpCall());

        System.out.println(cautare1.get("virus.com"));
        System.out.println();
        System.out.println(cautare2.get("malk.com"));
        System.out.println();
        System.out.println(cautare3.get("viberco.com"));
        System.out.println();
        System.out.println(cautare4.get("google.com"));
        System.out.println();

        System.out.println(cautare1.ping("virus.com"));
        System.out.println();
        System.out.println(cautare2.ping("malk.com"));
        System.out.println();
        System.out.println(cautare3.ping("viberco.com"));
        System.out.println();
        System.out.println(cautare3.ping("google.com"));
        System.out.println();

    }
}
