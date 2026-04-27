package ro.ase.cts.clase;

import java.util.*;

public class Salon {
    private boolean[] paturiLibere=new boolean[10];

    public Salon() {
        paturiLibere[1]=true;
        paturiLibere[2]=true;
        paturiLibere[3]=true;
        paturiLibere[4]=true;
    }

    public int getPatLiber(){
        for(int i=0;i<paturiLibere.length;i++){
            if(paturiLibere[i]){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int pozitie){
        this.paturiLibere[pozitie]=false;

    }
}