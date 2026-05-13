package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        VerificareSpectator verificareVIP=new VerificareVip();
        VerificareSpectator verificareTribuna=new VerificareTribuna();
        VerificareSpectator verificarePeluza=new SpectatorPeluza();

        Spectator spectator=new Spectator("Ionel");
        spectator.setTipVerificare(verificareVIP);
        spectator.controlAcces();
        System.out.println();

        spectator.setTipVerificare(verificareTribuna);
        spectator.controlAcces();
        System.out.println();

        spectator.setTipVerificare(verificarePeluza);
        spectator.controlAcces();
        System.out.println();
    }
}
