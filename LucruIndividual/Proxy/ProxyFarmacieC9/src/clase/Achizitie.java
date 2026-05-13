package clase;

public class Achizitie implements IAchizitie {
    @Override
    public void achizitioneazaMedicament(String denumireMedicament, Client client) {
        System.out.println("Clientul "+client.nume+" a achizitionat mecicamentul "+denumireMedicament);
    }
}
