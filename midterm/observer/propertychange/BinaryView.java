package midterm.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BinaryView implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        NumberInfo num = (NumberInfo) evt.getNewValue();
        System.out.println("Binary: " + Integer.toBinaryString(num.getNumber()));
    }
}