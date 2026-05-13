package main;

import clase.ClipVideo;
import clase.CompositeStreaming;
import clase.IClip;
import clase.TipComposite;

public class Main {
    public static void main(String[] args) {
        IClip categorieSport=new CompositeStreaming(TipComposite.Categorie,"SPORT");
        IClip categorieMuzica=new CompositeStreaming(TipComposite.Categorie,"MUZICA");

        IClip clip1=new ClipVideo(10f,"Cele mai wow goluri");
        IClip clip2=new ClipVideo(25.5f, "Interviu Simona Halep");
        IClip clip3=new ClipVideo(5.25f,"Rezumat meci Argentina-Spania");

        categorieSport.adaugaElement(clip1);
        categorieSport.adaugaElement(clip2);
        categorieSport.adaugaElement(clip3);

        IClip playlistMuzical=new CompositeStreaming(TipComposite.Playlist,"POP");
        IClip clip4 = new ClipVideo(3.48f, "Shakira-Ola");
        IClip clip5 = new ClipVideo(3.23f, "Lana-Marea");
        IClip clip6 = new ClipVideo(2.5f, "To love-Miss me");

        playlistMuzical.adaugaElement(clip4);
        playlistMuzical.adaugaElement(clip5);
        playlistMuzical.adaugaElement(clip6);

        IClip clip7 = new ClipVideo(3.02f, "Beyonce - Single Ladies");
        IClip clip8 = new ClipVideo(3.44f, "Britney Spears - Toxic");
        categorieMuzica.adaugaElement(playlistMuzical);
        categorieMuzica.adaugaElement(clip7);
        categorieMuzica.adaugaElement(clip8);

        categorieSport.afiseazaDetalii("\t");
        categorieMuzica.afiseazaDetalii("\t");
        System.out.println(categorieMuzica.getNumarComponente());

    }

}
