package ro.ase.cts.program;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.loaders.AngajatiLoader;
import ro.ase.cts.loaders.AplicantiLoader;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AplicantiLoader loader=new AngajatiLoader();
			listaAngajati = loader.loadAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}