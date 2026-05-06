package program;

import clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setCalatorieHandler(calatorieAutobuz);
        calatorieAutobuz.setCalatorieHandler(calatorieTramvai);
        calatorieTramvai.setCalatorieHandler(calatorieMetrou);

        System.out.println(calatorieTroleibuz.recomandareCalatorie(2));
        System.out.println(calatorieTroleibuz.recomandareCalatorie(4));
        System.out.println(calatorieTroleibuz.recomandareCalatorie(9));
        System.out.println(calatorieTroleibuz.recomandareCalatorie(11));
    }
}