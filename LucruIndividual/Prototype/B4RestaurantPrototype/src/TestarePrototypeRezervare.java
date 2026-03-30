public class TestarePrototypeRezervare {
    public static void main(String[] args) {
        Rezervare rezervare1=new Rezervare("Valcescu Petru",2,"0040764089563");
        Rezervare rezervare2=(Rezervare) rezervare1.copiaza();


        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());

        ( (Rezervare)rezervare2).setNrPersoane(4);
        ((Rezervare)rezervare2).setNrTelefon("0040768956453");
        System.out.println(rezervare2.toString()); //cu modificari , adaugam setari in Rezervare
    }
}
