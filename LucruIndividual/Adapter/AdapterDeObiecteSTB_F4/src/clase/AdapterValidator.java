package clase;

public class AdapterValidator implements Validator{

    private ValidatorMetrou validatorMetrou;

    public AdapterValidator(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void valideazaBilet() {
this.validatorMetrou.valideazaBiletSibteran();
    }
}
