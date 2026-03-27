package ro.ase.cts.SingletonProbleme.clase;

public class Elev extends Aplicant {
	private static int sumaFinantata = 30;
	private int clasa;
	private String tutore;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
				int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public static void setSumaFinantata(int sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		String sb = "Elev{" + super.toString() +
				", clasa=" + clasa +
				", tutore='" + tutore + '\'' +
				'}';
		return sb;
	}

	@Override
	public void afisareFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Elev.sumaFinantata + " Euro/zi in proiect.");
	}
}