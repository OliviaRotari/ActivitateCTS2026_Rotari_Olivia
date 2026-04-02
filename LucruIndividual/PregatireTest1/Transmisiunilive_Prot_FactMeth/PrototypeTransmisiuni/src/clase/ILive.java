package clase;

public interface ILive {
    ILive clone();
    void transmiteEvenimentLive();
    void adaugaComentariu(String comentariu);
    void afiseazaListaComentariilor();
    void conectareSpectator();
}
