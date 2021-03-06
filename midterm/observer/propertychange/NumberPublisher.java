package midterm.observer.propertychange;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class NumberPublisher{

    NumberInfo info = new NumberInfo();
    PropertyChangeSupport support;

    public NumberPublisher(){
        support = new PropertyChangeSupport(this);
    }

    public void addObserver(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    public int getInfo() {
        return info.getNumber();
    }

    public void setNumberPublisher(int number) {
        info.setNumber(number);

        numberChanged();
    }

    public void numberChanged(){
        support.firePropertyChange("numbers", null, info);
    }
}
