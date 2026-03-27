
package ro.ase.cts.SingletonProbleme.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata = 10;

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static void setSumaFinantata(int sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat{");
		sb.append(super.toString());
		sb.append(", ocupatie='").append(ocupatie).append('\'');
		sb.append(", salariu=").append(salariu);
		sb.append('}');
		return sb.toString();
	}

	public void afisareFinantare() {
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste " + Angajat.sumaFinantata + " Euro/zi in proiect.");
	}

}