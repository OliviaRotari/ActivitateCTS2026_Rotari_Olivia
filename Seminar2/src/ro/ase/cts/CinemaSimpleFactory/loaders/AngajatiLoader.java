package ro.ase.cts.CinemaSimpleFactory.loaders;

import ro.ase.cts.CinemaSimpleFactory.clase.Angajat;
import ro.ase.cts.CinemaSimpleFactory.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiLoader extends AplicantiLoader {
    @Override
    public List<Aplicant> loadAplicants(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();
            super.loadAplicant(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }

        input2.close();
        return angajati;
    }
}