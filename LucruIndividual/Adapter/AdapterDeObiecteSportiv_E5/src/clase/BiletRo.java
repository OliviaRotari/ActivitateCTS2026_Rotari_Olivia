package clase;

public class BiletRo {
    public void rezervaBiletOnline(String meci, String data) {
        System.out.println("Ati rezervat un bilet pentru meciul " + meci + " din data de " + data);
        System.out.println("Va multumim ca ati ales Bilet.ro!");
    }

    public void vindeBiletOnline(String meci, String data) {
        System.out.println("Ati cumparat un bilet pentru meciul " + meci + " din data de " + data);
        System.out.println("Va multumim ca ati ales Bilet.ro!");
    }
}
