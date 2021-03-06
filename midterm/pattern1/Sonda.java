package midterm.pattern1;

import java.util.ArrayList;
import java.util.List;

public class Sonda {
    public static void main(String... args){

        List <Automobile> auto = new ArrayList<>();
        auto.add(new ABS(new Sivic()));
        auto.add(new Sunroof(new MusicSystem(new Sity())));

        int total = 0;
        for(Automobile automobile: auto){
            System.out.println(automobile.getDescription() + ": " + automobile.cost());
            total += automobile.cost();
        }
        System.out.println("Total: " + total);
    }
}
