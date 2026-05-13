package clase;

public class VanzareBilet implements IVanzareBilet{

    @Override
    public void vindeBiet(Persoana persoana) {
        System.out.println("Suporterul "+persoana.nume+" in varsta de "+persoana.varsta+
                " a achizitionat un bilet pentru urmatorul meci de fotbal");
    }
}
