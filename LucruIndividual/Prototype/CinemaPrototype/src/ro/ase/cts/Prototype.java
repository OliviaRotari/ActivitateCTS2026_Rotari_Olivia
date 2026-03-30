package ro.ase.cts;

public class Prototype {
    public static void main(String[] args) {
        IPersoanaSimulare p=new PersoanaSimulare("Vasilescu  Ion",23,"09876543456");
        IPersoanaSimulare p1=p.dublica();
        IPersoanaSimulare p2=p.dublica();
        IPersoanaSimulare p3=p.dublica();
        IPersoanaSimulare p4=p.dublica();

        System.out.println(p.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
