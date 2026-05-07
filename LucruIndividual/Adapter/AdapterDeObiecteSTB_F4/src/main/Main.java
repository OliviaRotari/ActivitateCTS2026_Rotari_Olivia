package main;

import clase.AdapterValidator;
import clase.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
        AdapterValidator adapterValidator=new AdapterValidator(validatorMetrou);
        adapterValidator.valideazaBilet();
    }
}
