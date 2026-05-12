package clase;

import javax.sql.rowset.spi.SyncResolver;

public interface IBilet {
    void rezervaBilet(String meci, String data);

    void vindeBilet(String meci, String data);
}
