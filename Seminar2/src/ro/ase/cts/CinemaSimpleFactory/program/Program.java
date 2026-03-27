package ro.ase.cts.CinemaSimpleFactory.program;

import ro.ase.cts.CinemaSimpleFactory.clase.Aplicant;
import ro.ase.cts.CinemaSimpleFactory.loaders.AngajatiLoader;
import ro.ase.cts.CinemaSimpleFactory.loaders.AplicantiLoader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantiLoader loader = new AngajatiLoader();
			listaAngajati = loader.loadAplicants("angajati.txt");
			for (Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareFinantare();
				angajat.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}