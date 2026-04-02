package clase;

import java.util.ArrayList;
import java.util.List;

public class TransmisiuneLive implements ILive {
    private String numeEveniment;
    private int numarSpectatori;
    private List<String> comentarii;

    public TransmisiuneLive(String numeEveniment, int numarSpectatori) {
        this.numeEveniment = numeEveniment;
        this.numarSpectatori = numarSpectatori;
        this.comentarii = new ArrayList<String>();
    }

    public void setComentarii(List<String> comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public ILive clone() {
        List<String> comentariiCopiate=new ArrayList<>(this.comentarii);
        TransmisiuneLive clona=new TransmisiuneLive(this.numeEveniment,this.numarSpectatori);
        clona.setComentarii(comentariiCopiate);
        return clona;

    }

    @Override
    public void transmiteEvenimentLive() {
        StringBuilder sb=new StringBuilder("LIVE: ");
        sb.append(this.numeEveniment).append("\n")
                .append(this.numarSpectatori).append("persoane conectate\n");
        System.out.println(sb.toString());
        if(!this.comentarii.isEmpty()){
            this.afiseazaListaComentariilor();
        }
    }

    @Override
    public void adaugaComentariu(String comentariu) {
        this.comentarii.add(comentariu);
    }

    @Override
    public void afiseazaListaComentariilor() {
        StringBuilder sb=new StringBuilder("Comentarii: \n");
        for(String comentariu:comentarii){
            sb.append("\t").append(comentariu).append("\n");
        }
        System.out.println(sb.toString());
    }

    @Override
    public void conectareSpectator() {
        this.numarSpectatori++;
    }
}
