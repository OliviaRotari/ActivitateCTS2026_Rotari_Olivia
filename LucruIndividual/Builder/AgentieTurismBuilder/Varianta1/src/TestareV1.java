public class TestareV1 {
    public static void main(String[] args) {
        PachetTransport pachetTransport = new PachetTransportBuilder().setAreWifi(true).setAreAnimale(true).setAreAC(true).build();
        System.out.println(pachetTransport.toString());
    }
}
