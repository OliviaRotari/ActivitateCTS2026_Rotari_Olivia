package ro.ase.cts.fabrici;

import ro.ase.cts.clase.CazareCabana;
import ro.ase.cts.clase.CazareHotel;
import ro.ase.cts.clase.IPachetTuristic;

public class CazareFactory implements PachetTuristicFactory {
    @Override
    public IPachetTuristic crearePachet(TipPachetTuristic tipPachetTuristic) {
        return switch (tipPachetTuristic) {
            case TipPachetCazare.CazareHotel -> new CazareHotel();
            case TipPachetCazare.CazareCabana -> new CazareCabana();
            default -> null;
        };
    }
}
