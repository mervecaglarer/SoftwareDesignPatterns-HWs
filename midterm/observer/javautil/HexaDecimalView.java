package midterm.observer.javautil;

import java.util.Observable;
import java.util.Observer;

public class HexaDecimalView implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        NumberPublisher publisher = (NumberPublisher) o;
        System.out.println("Hexadecimal: " + Integer.toHexString(publisher.getNumber()));
    }
   
}