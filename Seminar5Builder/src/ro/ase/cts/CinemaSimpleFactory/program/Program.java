package ro.ase.cts.CinemaSimpleFactory.program;

import ro.ase.cts.CinemaSimpleFactory.clase.Internare;
import ro.ase.cts.CinemaSimpleFactory.clase.InternareBuilder;
import ro.ase.cts.CinemaSimpleFactory.clase.InternareBuildertAlternativ;

public class Program {
    public static void main(String[] args) {
        Internare internare1 = new Internare(true, true, true, false, "Ion Marin");
        Internare internare2 = new Internare(false, false, false, false, "Crina Maria");

        InternareBuilder builder = new InternareBuilder("Marin Georgescu");
        Internare internare3 = builder.build();
        Internare internare4 = builder.setNume("Marin Ionescu").setPat(true).setMicDejun(true).setPapuciDeCamera(true).setHalatDeBaie(true).build();

        System.out.println(internare3.toString());
        System.out.println(internare4.toString());

        InternareBuildertAlternativ buildertAlternativ = new InternareBuildertAlternativ();
        buildertAlternativ.setMicDejun(true);

        Internare internare101 = buildertAlternativ.build("Vlad Marinescu");
        Internare internare102 = buildertAlternativ.build("Petrescu Maria");
        Internare internare103 = buildertAlternativ.build("Valeriu Verban");

        System.out.println(internare101.toString());
        System.out.println(internare102.toString());
        System.out.println(internare103.toString());
    }
}