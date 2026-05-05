package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String nume;
    private List<Pacient> listaPacienti = new ArrayList<>();

    public Spital(String nume) {
        this.nume = nume;
        this.listaPacienti = new ArrayList<>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Pacient pacient : listaPacienti) {
            pacient.receptionareNotificare(mesaj + " de la Spitalul " + this.nume);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificareVirus() {
        trimiteMesaj("Exista un virus nou in oras!");
    }

    public void notificareEpidemie() {
        trimiteMesaj("Exista o epidemie in oras!");
    }
}