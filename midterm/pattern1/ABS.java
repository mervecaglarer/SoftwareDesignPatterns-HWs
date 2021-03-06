package midterm.pattern1;

public class ABS extends QualityDecorator{

    public ABS(Automobile automobile) {
        super(automobile);
        description = "ABS";
    }

    @Override
    public int cost() {
        return 5000 + automobile.cost();
    } 
}
