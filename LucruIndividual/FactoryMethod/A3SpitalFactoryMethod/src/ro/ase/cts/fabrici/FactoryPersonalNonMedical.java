package ro.ase.cts.fabrici;

import ro.ase.cts.clase.APersonal;
import ro.ase.cts.clase.Registrator;
import ro.ase.cts.clase.Secretar;

public class FactoryPersonalNonMedical implements FactoryPersonal{
    @Override
    public APersonal creeazaPersonal(TipPersonal tip, String nume, String prenume, int salariu, int aniVechime, String extra) {
        if(!(tip instanceof TipPersonal)){
            throw new IllegalArgumentException("Tip incorect pentru personal");
        }
        return switch ((TipPersonalNonMedical)tip){
            case SECRETAR -> new Secretar(nume,prenume,salariu,aniVechime);
            case REGISTRATOR -> new Registrator(nume,prenume,salariu,aniVechime);
            default -> null;
        };
    }
}