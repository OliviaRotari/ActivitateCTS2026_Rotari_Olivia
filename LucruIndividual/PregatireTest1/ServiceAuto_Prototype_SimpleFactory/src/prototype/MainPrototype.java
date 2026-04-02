package prototype;

import java.util.ArrayList;
import java.util.List;

public class MainPrototype {
    public static void main(String[] args) {
        IMasina masina=new IMasina() {
            @Override
            public String getModel() {
                return "Dacia";
            }

            @Override
            public int getAnFabricatie() {
                return 2023;
            }
        };

        ConcretStickerPrototype stickerPrototype=new ConcretStickerPrototype(masina,"50*20 cm");

        List<ISticker> listaStickere=new ArrayList<>();
        for(int i=0; i<4;i++){
            listaStickere.add(stickerPrototype.clona());
        }

        for(ISticker s:listaStickere){
            s.stickerDetalii();
        }


        System.out.println("====Cu deep copie, clasa masina adaugata====");
        IMasina masina1=new Masina("bmw",2024);
        ISticker sticker5=new ConcretStickerPrototype(masina1,"20,60");
        ISticker sticker6=sticker5.clona();

        sticker5.stickerDetalii();
        sticker6.stickerDetalii();


    }



}
