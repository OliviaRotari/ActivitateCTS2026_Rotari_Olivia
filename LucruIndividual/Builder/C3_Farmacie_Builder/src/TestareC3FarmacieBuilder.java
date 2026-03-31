public class TestareC3FarmacieBuilder {
    public static void main(String[] args) {
        FacturaBuilder builder =new FacturaBuilder();
        Factura factura=builder.setPlatesteCuCardul(true).setNrPungi(2).setCotaTVA(5)
                .build("Factura1","Petrascu Ana");
        System.out.println(factura.toString());

        Factura factura2=builder.setPlatesteCuCardul(true).setNrPungi(7).setCotaTVA(9).setAreCardDeFidelitate(false)
                .build("Factura2","Ivan Ioana");
        System.out.println(factura2);
    }
}
