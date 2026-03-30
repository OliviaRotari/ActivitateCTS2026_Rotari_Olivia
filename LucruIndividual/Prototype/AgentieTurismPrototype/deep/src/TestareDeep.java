public class TestareDeep {
    public static void main(String[] args) {
        IListaOferte listaOferte=new ListaOferte();
        listaOferte.incarcareListaOferte();

        IListaOferte copieListaOferte=null;
        copieListaOferte=listaOferte.copiaza();

        System.out.println(copieListaOferte.toString());
    }
}
