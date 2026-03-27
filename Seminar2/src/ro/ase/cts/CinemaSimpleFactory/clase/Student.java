package ro.ase.cts.CinemaSimpleFactory.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata = 20;

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public static void setSumaFinantata(int sumaFinantata) {
		Student.sumaFinantata = sumaFinantata;
	}

	public Student() {
		super();
	}

	@Override
	public void afisareFinantare() {
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste " + Student.sumaFinantata + " Euro/zi in proiect.");
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append(super.toString());
		sb.append(", facultate='").append(facultate).append('\'');
		sb.append(", anStudii=").append(anStudii);
		sb.append('}');
		return sb.toString();
	}
}