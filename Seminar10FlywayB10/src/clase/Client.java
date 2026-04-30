package clase;

public class Client implements ClientAbstract {
    private String nume;
    private String numarTelefon;
    private String mail;

    protected Client(String nume, String numarTelefon, String mail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.mail = mail;
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {
        System.out.println("Clientul cu numele:" + nume + " are numarul de telefon "
                + numarTelefon + " si adresa de mail " + mail);
        System.out.println(rezervare.toString());
    }

    @Override
    public void plateste(Rezervare rezervare, double taxaPerPersoana) {
        System.out.println("Clientul cu numele: " + nume + " trebuie sa plateasca " + rezervare.getNumarPersoane() * taxaPerPersoana + " RON");
    }

}
