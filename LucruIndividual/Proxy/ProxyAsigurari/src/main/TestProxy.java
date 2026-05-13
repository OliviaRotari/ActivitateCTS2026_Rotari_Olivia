package main;

import clase.Contract;
import clase.IContract;
import clase.ProxyContract;

public class TestProxy {
    public static void main(String[] args) {
        IContract contract1=new ProxyContract("Manole Ion","RCA");
        IContract contract2=new ProxyContract("Maria Elene","Casco");

        contract1.multiplicareContract();
        contract1.multiplicareContract();
        contract2.multiplicareContract();
        contract1.multiplicareContract();
        contract2.multiplicareContract();
    }
}
