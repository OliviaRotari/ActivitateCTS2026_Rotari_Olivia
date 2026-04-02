package SimpleFactory.main;

import SimpleFactory.clase.IComponenta;
import SimpleFactory.fabrica.FabricaComponente;
import SimpleFactory.fabrica.TipComponenta;

import java.util.ArrayList;
import java.util.List;

public class TestareFabrica {
    public static void main(String[] args) {
        FabricaComponente fabrica=new FabricaComponente();
        List<IComponenta> listaComponenete=new ArrayList<>();
        //creare componente
        IComponenta componenta1=fabrica.creeazaComponenta(TipComponenta.USA);
        IComponenta componenta2=fabrica.creeazaComponenta(TipComponenta.CAPOTA);
        IComponenta componenta3=fabrica.creeazaComponenta(TipComponenta.USA);
        IComponenta componenta4=fabrica.creeazaComponenta(TipComponenta.CAPOTA);

        //adaugare componente
        listaComponenete.add(componenta1);
        listaComponenete.add(componenta2);
        listaComponenete.add(componenta3);
        listaComponenete.add(componenta4);

        for(IComponenta componenta:listaComponenete){
            componenta.componentDetails();
        }
    }
}
