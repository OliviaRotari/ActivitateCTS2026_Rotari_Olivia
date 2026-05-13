package clase;

public class ClipVideo implements IClip{
   private double durata;
   private String titlu;

    public ClipVideo(double durata, String titlu) {
        this.durata = durata;
        this.titlu = titlu;
    }

    @Override
    public void afiseazaDetalii(String aliniat) {
        String durataString=String.format("%.2f",this.durata);
        System.out.println(aliniat+this.titlu+"-"+durataString+" min");
    }

    @Override
    public void adaugaElement(IClip clip) {
throw  new RuntimeException("Operatia nu este permisa pe acest nivel");
    }

    @Override
    public void stergeElement(IClip clip) {
        throw  new RuntimeException("Operatia nu este permisa pe acest nivel");
    }

    @Override
    public IClip getClip(int index) {
        throw  new RuntimeException("Operatia nu este permisa pe acest nivel");
    }

    @Override
    public int getNumarComponente() {
        return 1;
    }
}
