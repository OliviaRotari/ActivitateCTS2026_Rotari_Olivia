package clase;

public class AdapterBilet implements IBilet {
    private BiletRo bilet;

    public AdapterBilet(BiletRo bilet) {
        super();
        this.bilet = bilet;
    }


    @Override
    public void rezervaBilet(String meci, String data) {
        this.bilet.vindeBiletOnline(meci, data);
    }

    @Override
    public void vindeBilet(String meci, String data) {
        this.bilet.vindeBiletOnline(meci, data);
    }
}
