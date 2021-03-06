package midterm.pattern1;

public class Airbag extends QualityDecorator{

    public Airbag(Automobile automobile) {
        super(automobile);
        description = "Airbag";
    }

    @Override
    public int cost() {
        return 3000 + automobile.cost();
    }   
}
