package main;

import clase.FacadeDeschidereUsi;
import clase.UsaFata;
import clase.UsaMijloc;
import clase.UsaSpate;

public class Main {
    public static void main(String[] args) {
        FacadeDeschidereUsi facade = new FacadeDeschidereUsi(new UsaFata(), new UsaMijloc(), new UsaSpate());
        facade.deschideFortatToateUsile();
        System.out.println();
        facade.deschideLiberToateUsile();
    }
}
