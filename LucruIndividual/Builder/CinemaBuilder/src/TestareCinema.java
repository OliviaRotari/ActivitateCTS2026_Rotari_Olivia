public class TestareCinema {
    public static void main(String[] args) {
        Sala sala1 = new SalaBuilderV1().setNrSala(8).setFilmDifuzat("Piratii din Caraibe").build();
        Sala sala2 = new SalaBuilderV1().setNrSala(3).setFilmDifuzat("Help").setLuminaAprina(false).build();

        System.out.println(sala1);
        System.out.println(sala2);
    }
}
