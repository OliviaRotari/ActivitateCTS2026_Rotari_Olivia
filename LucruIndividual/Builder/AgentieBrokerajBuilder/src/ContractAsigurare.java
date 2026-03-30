public class ContractAsigurare {
    String numeClient;

    IAsigurareAuto asigurareParcAuto;
    IAsigurareProductie asigurareProductie;
    IAsigurareServicii asigurareServicii;

    public ContractAsigurare() {
    }

    public ContractAsigurare(String numeClient,
                             IAsigurareAuto asigurareParcAuto,
                             IAsigurareProductie asigurareProductie,
                             IAsigurareServicii asigurareServicii) {
        this.numeClient = numeClient;
        this.asigurareParcAuto = asigurareParcAuto;
        this.asigurareProductie = asigurareProductie;
        this.asigurareServicii = asigurareServicii;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public IAsigurareAuto getAsigurareParcAuto() {
        return asigurareParcAuto;
    }

    public void setAsigurareParcAuto(IAsigurareAuto asigurareParcAuto) {
        this.asigurareParcAuto = asigurareParcAuto;
    }

    public IAsigurareProductie getAsigurareProductie() {
        return asigurareProductie;
    }

    public void setAsigurareProductie(IAsigurareProductie asigurareProductie) {
        this.asigurareProductie = asigurareProductie;
    }

    public IAsigurareServicii getAsigurareServicii() {
        return asigurareServicii;
    }

    public void setAsigurareServicii(IAsigurareServicii asigurareServicii) {
        this.asigurareServicii = asigurareServicii;
    }
}

