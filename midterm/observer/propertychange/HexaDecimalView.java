package midterm.observer.propertychange;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class HexaDecimalView implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        NumberInfo num = (NumberInfo) evt.getNewValue();
        System.out.println("Hexadecimal: " + Integer.toHexString(num.getNumber()));
    }
}