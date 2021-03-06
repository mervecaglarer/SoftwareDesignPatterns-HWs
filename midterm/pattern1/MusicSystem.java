package midterm.pattern1;

public class MusicSystem extends QualityDecorator{

    public MusicSystem(Automobile automobile) {
        super(automobile);
        description = "Music System";
    }

    @Override
    public int cost() {
        return 1000 + automobile.cost();
    }
}
