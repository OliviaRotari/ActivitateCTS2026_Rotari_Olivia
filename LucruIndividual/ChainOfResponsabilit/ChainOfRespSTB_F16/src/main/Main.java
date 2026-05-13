package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Handler troleibuz=new RecomandaTroleibuz();
        Handler autobuz=new RecomandaAutobuz();
        Handler metrou=new RecomandaMetrou();
        Handler tramvai=new RecomandaTramvai();

        troleibuz.setSuccesor(autobuz);
        autobuz.setSuccesor(tramvai);
        tramvai.setSuccesor(metrou);

        troleibuz.recomandaMijlocTransport(2);
        troleibuz.recomandaMijlocTransport(4);
        troleibuz.recomandaMijlocTransport(8);
        troleibuz.recomandaMijlocTransport(12);
    }

}

