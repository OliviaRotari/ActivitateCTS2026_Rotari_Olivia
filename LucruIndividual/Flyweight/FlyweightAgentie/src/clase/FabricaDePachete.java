package clase;
import java.util.HashMap;

public class FabricaDePachete {
    private HashMap<Integer, IPachetTuristic> pacheteTuristice;

    public FabricaDePachete() {
        this.pacheteTuristice = new HashMap<Integer, IPachetTuristic>();
    }

    public int getNrPachete() {
        return pacheteTuristice.size();
    }

    public IPachetTuristic getPachetTuristic(int codPachet) {
        IPachetTuristic pachetTuristic = pacheteTuristice.get(codPachet);
        if (pachetTuristic == null) {
            pachetTuristic = new PachetTuristic(codPachet, "Hotel", "OrasDestinatie", true);
            pacheteTuristice.put(codPachet, pachetTuristic);
        }
        return pachetTuristic;
    }
}