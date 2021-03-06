package midterm.observer.myclasses;

public class NumberPublisherDemo{

    public static void main(String[] args){

        Subject number = new Subject();

        new DecimalView(number);
        new BinaryView(number);
        new HexaDecimalView(number);

        System.out.print("Sending numbers...");
        number.setState(1084583); 
    }
}
