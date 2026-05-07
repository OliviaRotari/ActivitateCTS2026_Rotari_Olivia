package clase;

public class FacadeDeschidereUsi {
    private UsaFata usaFata;
    private UsaMijloc usaMijloc;
    private UsaSpate usaSpate;

    public FacadeDeschidereUsi(UsaFata usaFata, UsaMijloc usaMijloc, UsaSpate usaSpate) {
        this.usaFata = usaFata;
        this.usaMijloc = usaMijloc;
        this.usaSpate = usaSpate;
    }

    public void deschideLiberToateUsile() {
        System.out.println("Atentie! Calorii solicita deschiderea usilor!");
        this.usaFata.deschideLiber();
        this.usaMijloc.deschideLiber();
        ;
        this.usaSpate.deschideLiber();
    }

    public void deschideFortatToateUsile() {
        System.out.println("Atenie! Se deschid usile!");
        this.usaFata.deschideFortat();
        this.usaMijloc.deschideFortat();
        this.usaSpate.deschideFortat();
    }
}
