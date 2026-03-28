package ro.ase.cts.fabrici;

import ro.ase.cts.clase.IPachetTuristic;

public interface PachetTuristicFactory {
    IPachetTuristic crearePachet(TipPachetTuristic tipPachetTuristic);
}
