package ro.ase.cts.CinemaSimpleFactory.singletonLazy;

public class programLazyInitialization {
    public static void main(String[] args) {
        HotelLazy hotel1 = HotelLazy.getInstanta("Hotelul 1", 2, 3);
        HotelLazy hotel2 = HotelLazy.getInstanta("Hotel 2", 3, 2);

        hotel1.afisareInchiriereCamera();
        hotel1.afisareInchiriereCamera();

        hotel2.afisareInchiriereCamera();
        hotel2.afisareInchiriereCamera();

    }

}