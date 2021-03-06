package midterm.pattern1;

public abstract class QualityDecorator extends Automobile{

    protected Automobile automobile;
    
    public QualityDecorator(Automobile automobile){
        this.automobile = automobile;
    }

    public String getDescription(){
        return automobile.getDescription() + " +" + description ;
    }
} 