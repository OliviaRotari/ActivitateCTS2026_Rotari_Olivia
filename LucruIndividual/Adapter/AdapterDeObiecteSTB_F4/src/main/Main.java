package main;

import clase.AdapterValidator;
import clase.Validator;
import clase.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        ValidatorMetrou validatorMetrou=new ValidatorMetrou();
        Validator adapterValidator=new AdapterValidator(validatorMetrou);
        adapterValidator.valideazaBilet();
    }
}
