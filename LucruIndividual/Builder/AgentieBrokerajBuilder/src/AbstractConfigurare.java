public abstract class AbstractConfigurare {
    public abstract void adaugaAsigurareAuto(IAsigurareAuto asigurareAuto);

    public abstract void adaugaAsigurareProductie(IAsigurareProductie asigurareProductie);

    public abstract void adaugaAigurareServixii(IAsigurareServicii asigurareServicii);

    public abstract ContractAsigurare getContract();//build
}
