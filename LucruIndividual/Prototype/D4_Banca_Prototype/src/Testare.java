public class Testare {
    public static void main(String[] args) {
        ICont prototype = new Cont("Andrei", "RO93 0000 0000 0000 0000", Valuta.EUR, 1249.50f);
        System.out.println(prototype);
        ICont clona = prototype.clone();
        System.out.println(clona.toString());


        clona.setIBAN("RO98 7867 8979 5678 5678");
        clona.setSold(0.0f);
        System.out.println(clona.toString());
    }
}
