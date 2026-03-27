package ro.ase.cts.factory;

import ro.ase.cts.clase.ASupa;
import ro.ase.cts.clase.SupaDeCiuperci;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;

public class SupaFactory {
   public ASupa creareSupa(TipSupa tipSupa,String numeSupa){
       ASupa supa=null;

       switch (tipSupa){
           case VITA:
               supa=new SupaDeVita();
               supa.setNume(numeSupa);
               break;
           case CIUPERCI:
               supa=new SupaDeCiuperci();
               supa.setNume(numeSupa);
               break;
           case LEGUME:
               supa=new SupaDeLegume();
               supa.setNume(numeSupa);
               break;
       }
       return supa;
   }
}
