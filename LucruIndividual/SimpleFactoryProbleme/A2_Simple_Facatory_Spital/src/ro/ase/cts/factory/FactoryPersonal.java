package ro.ase.cts.factory;

import ro.ase.cts.clase.Asistent;
import ro.ase.cts.clase.Brancardier;
import ro.ase.cts.clase.Medic;
import ro.ase.cts.clase.Personal;
public class FactoryPersonal {
    public Personal createPersonal(TipPersonal tipPersonal, String nume, String prenume,
                                   int salariu, int aniVechime, String informatiiAditionale) {
        if (!(tipPersonal instanceof TipPersonal)) {
            throw new IllegalArgumentException("Tip incorect pentru personal!");
        }

        return switch (tipPersonal){
            case ASISTENT -> new Asistent(nume, prenume, salariu, aniVechime);
            case MEDIC -> new Medic(nume, prenume, salariu, aniVechime, informatiiAditionale);
            case BRANCARDIER -> new Brancardier(nume, prenume, salariu, aniVechime);
            default -> null;
        };
    }
}