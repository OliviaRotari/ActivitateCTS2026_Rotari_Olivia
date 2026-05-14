package chain;

import proxy.IHttpCall;

public class Main {
    public static void main(String[] args) {
      AntivirusHandler handlerMic=new VirusMic();
      AntivirusHandler handlerMediu=new VirusMediu();
      AntivirusHandler handlerMare=new VirusMare();

      handlerMic.setSuccesor(handlerMediu);
      handlerMediu.setSuccesor(handlerMare);

        System.out.println("Scenariu virus mic:");
        handlerMic.handleVirus(1);
        System.out.println();
        System.out.println("Scenariu virus mediu:");
        handlerMic.handleVirus(5);
        System.out.println();
        System.out.println("Scenariu virus mare:");
        handlerMic.handleVirus(10);

    }
}
