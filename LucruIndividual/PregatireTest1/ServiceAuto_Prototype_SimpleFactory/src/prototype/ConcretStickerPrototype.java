package prototype;

public class ConcretStickerPrototype implements ISticker{
    private final IMasina masina;
    private final String dimensiune;

    public ConcretStickerPrototype(IMasina masina, String dimensiune) {
        this.masina = masina;
        this.dimensiune = dimensiune;
    }

    @Override
    public ISticker clona() {
        //shalow clona superficiala
      //  return new ConcretStickerPrototype(this.masina,this.dimensiune);


        //deepCopy dupa adaugareClasa masina
        IMasina masinaCopiata=new Masina(this.masina.getModel(),this.masina.getAnFabricatie());
        return new ConcretStickerPrototype(masinaCopiata,this.dimensiune);
    }

    @Override
    public void stickerDetalii() {
        System.out.println("Model: "+masina.getModel()+", An fabricatie: "+masina.getAnFabricatie()+", are dimensiunile: "+dimensiune);
    }
}
