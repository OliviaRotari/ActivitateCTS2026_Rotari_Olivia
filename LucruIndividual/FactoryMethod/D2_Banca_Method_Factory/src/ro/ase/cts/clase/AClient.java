package ro.ase.cts.clase;

import javax.swing.plaf.PanelUI;

public abstract class AClient {
    private String nume;
    private String adresa;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public AClient(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public abstract void profilClient();
}
