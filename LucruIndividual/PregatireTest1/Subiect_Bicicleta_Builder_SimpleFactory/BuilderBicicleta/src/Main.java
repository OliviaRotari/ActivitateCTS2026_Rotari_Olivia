import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IBicicleta> listaBiciclete = new ArrayList<IBicicleta>();


        listaBiciclete.add(new BuilderBicicleta().buildBicicleta());
        listaBiciclete.add(new BuilderBicicleta()
                .setDiametruRoti(20).setPret(250).setAreCascaProtectie(true)
                .setTipFrana(TipFrana.DISC).buildBicicleta());
        listaBiciclete.add(new BuilderBicicleta()
                .setDiametruRoti(25.8f).setPret(800)
                .setTipFrana(TipFrana.V_BRAKE).setAreCotiere(true)
                .setAreGenunchere(true).buildBicicleta());
        listaBiciclete.add(new BuilderBicicleta()
                .setDiametruRoti(45.9f).setPret(1250).setAreCascaProtectie(true)
                .setTipFrana(TipFrana.TAMBUR).setAreCotiere(true)
                .setAreGenunchere(true).buildBicicleta());
        listaBiciclete.add(new BuilderBicicleta()
                .setDiametruRoti(39).setPret(920)
                .setTipFrana(TipFrana.DISC).setAreOchelari(true)
                .buildBicicleta());

        int contor=1;
        for(IBicicleta bicicleta:listaBiciclete){
            System.out.println("Bicicleta" +contor+":");
            bicicleta.descriere();
            contor++;
        }


    }
}
