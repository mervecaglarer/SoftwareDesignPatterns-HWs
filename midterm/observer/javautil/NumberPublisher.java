package midterm.observer.javautil;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class NumberPublisher extends Observable{

    private int number;
    
    List<Observer> observers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumberPublisher(int number) {
        this.number = number;
        
        numberChanged();
    }

    public void numberChanged(){
        setChanged();
        notifyObservers();
    }

}
