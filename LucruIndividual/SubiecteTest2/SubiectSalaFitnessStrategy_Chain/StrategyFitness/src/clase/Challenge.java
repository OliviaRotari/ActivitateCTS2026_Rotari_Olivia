package clase;

public class Challenge implements IChallenge{
    private IExercitiu exercitiu;
    private String numeAbonat;

    public Challenge( String numeAbonat) {
        this.numeAbonat = numeAbonat;
    }

    @Override
    public void executaGhallenge() {
        System.out.println("Challenge pentru "+this.numeAbonat);
        for(int i=0; i<5;i++){
            System.out.println("Exercitiul "+(i+1)+": ");
            this.exercitiu.executaExercitiu();
        }
        System.out.println();
    }

    @Override
    public void setExercitiu(IExercitiu exercitiu) {
this.exercitiu=exercitiu;
    }
}
