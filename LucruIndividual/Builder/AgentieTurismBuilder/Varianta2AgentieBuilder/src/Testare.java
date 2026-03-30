public class Testare {
    public static void main(String[] args) {
        PachetTransport pachetTransport =new PachetTransportBuilder()
                .setAreAC(true).setAreAnimale(true).build();
        System.out.println(pachetTransport.toString());

        PachetTransport pachetTransport2=new PachetTransport();
        pachetTransport2.setAreWifi(true);
        pachetTransport2.setAreTV(true);
        System.out.println(pachetTransport2.toString());
    }
}

