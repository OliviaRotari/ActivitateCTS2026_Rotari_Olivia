package SingletonProbleme.CinemaSingletonLazyInitialization;

public class TestCinematografSingleton {
    public static void main(String[] args) {
        Cinematograf c1=Cinematograf.getInstance(4);
        Cinematograf c2=Cinematograf.getInstance(6);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
