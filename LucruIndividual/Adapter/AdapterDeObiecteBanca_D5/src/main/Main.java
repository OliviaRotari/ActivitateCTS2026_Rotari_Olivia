package main;

import clase.AdapterCredite;
import clase.CreditareLeasing;
import clase.CreditareStandard;
import clase.ICreditare;

public class Main {
    public static void main(String[] args) {
        CreditareLeasing leasing=new CreditareLeasing();
        ICreditare adapter=new AdapterCredite(leasing);
        adapter.acordaCredit("Mihai",17000);
        adapter.acordaCredit("Marin",350000);
    }
}
