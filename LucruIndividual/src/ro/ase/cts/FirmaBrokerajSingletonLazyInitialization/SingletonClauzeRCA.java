package ro.ase.cts.FirmaBrokerajSingletonLazyInitialization;

public class SingletonClauzeRCA {
    //lazy
    private static SingletonClauzeRCA instance = null;
    private int limitaMaximaAsigurareCamioane = 2500;
    private int limitaMaximaAsigurareAutoturisme = 2000;

    public int getLimitaMaximaAsigurareCamioane() {
        return limitaMaximaAsigurareCamioane;
    }

    public void setLimitaMaximaAsigurareCamioane(int limitaMaximaAsigurareCamioane) {
        this.limitaMaximaAsigurareCamioane = limitaMaximaAsigurareCamioane;
    }

    public int getLimitaMaximaAsigurareAutoturisme() {
        return limitaMaximaAsigurareAutoturisme;
    }

    public void setLimitaMaximaAsigurareAutoturisme(int limitaMaximaAsigurareAutoturisme) {
        this.limitaMaximaAsigurareAutoturisme = limitaMaximaAsigurareAutoturisme;
    }

    //constructor privat,apelat doar din interiorul clasei
    private SingletonClauzeRCA() throws Exception {
        if (instance != null) {
            throw new Exception("Obiect Singleton deja creeata");
        }
    }

    //metoda publica
    public static SingletonClauzeRCA getInstance() throws Exception {
        if (instance == null) {
            instance = new SingletonClauzeRCA();
        }
        return instance;
    }
}