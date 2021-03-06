package midterm.observer.myclasses;

import java.util.ArrayList;
import java.util.List;

class Subject {
    
    private List<Observer> observers = new ArrayList<>(); 
    private int num;

    public void add(Observer o) {
        observers.add(o);
    }
    
    public int getState() {
        return num;
    }

    public void setState(int value) {
        this.num = value;
        execute();
    }

    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}



