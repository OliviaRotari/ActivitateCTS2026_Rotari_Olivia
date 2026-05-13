package clase;

import java.util.HashMap;

public class FabricaDePachete {
    private HashMap<Integer, IPachetTuristic> pacheteTuristice;

    public FabricaDePachete() {
        this.pacheteTuristice = new HashMap<>();
    }

    public int getNumarPachete() {
        return pacheteTuristice.size();
    }

    public IPachetTuristic getPachetTuristic(int codPachet) {
        IPachetTuristic pachet = pacheteTuristice.get(codPachet);
        if (pachet == null) {
            pachet = new PachetTuristic(codPachet, "Hotel", "OrasTuristic", true);
            pacheteTuristice.put(codPachet, pachet);
        }
        return pachet;
    }
}
