package midterm.pattern1;

public class Sunroof extends QualityDecorator{

    public Sunroof(Automobile automobile) {
        super(automobile);
        description = "Sunroof";
    }

    @Override
    public int cost() {
        return 2000 + automobile.cost();
    }
}
