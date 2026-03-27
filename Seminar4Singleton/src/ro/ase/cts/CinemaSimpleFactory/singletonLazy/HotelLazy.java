package ro.ase.cts.CinemaSimpleFactory.singletonLazy;

public class HotelLazy {
    private String denumireHotel;
    private int nrCamere;
    private int nrCamereInchiriate;
    private int nrAngajati;

    public void afisareInchiriereCamera() {
        if (nrCamereInchiriate == nrCamere) {
            System.out.println("Nu mai avem camere disponibile");
        } else {
            System.out.println("Camera a fost inchiriata");
            nrCamereInchiriate++;
        }
    }

    private HotelLazy(String denumireHotel, int nrCamere, int nrAngajati) {
        this.denumireHotel = denumireHotel;
        this.nrCamere = nrCamere;
        this.nrCamereInchiriate = 0;
        this.nrAngajati = nrAngajati;
    }

    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append(denumireHotel);
        sb.append(nrCamere);
        sb.append(nrCamereInchiriate);
        sb.append(nrAngajati);
        System.out.println(sb.toString());
    }

    private static HotelLazy instanta = null;

    public static synchronized HotelLazy getInstanta(String denumireHotel, int nrCamere, int nrAngajati) {
        if (instanta == null) {
            instanta = new HotelLazy(denumireHotel, nrCamere, nrAngajati);
        }
        return instanta;
    }


}