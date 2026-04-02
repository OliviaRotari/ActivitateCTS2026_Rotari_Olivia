package clase;

public class Main{
    public static void main(String[] args) {
        ILive prototype=new TransmisiuneLive("Meci Romanaia-Turcia",230);
        prototype.adaugaComentariu("GOOOL");
        prototype.adaugaComentariu(" Hai Romania");
        prototype.adaugaComentariu("Vom castiga");

        for(int i=0;i<10;i++){
            prototype.conectareSpectator();
        }
        prototype.transmiteEvenimentLive();

        ILive clona=prototype.clone();
        for(int i=0;i<5;i++){
            clona.conectareSpectator();
        }
        clona.adaugaComentariu("Hai ca puteti");
        clona.adaugaComentariu("Turcia va pierde");
        clona.transmiteEvenimentLive();
    }
}
