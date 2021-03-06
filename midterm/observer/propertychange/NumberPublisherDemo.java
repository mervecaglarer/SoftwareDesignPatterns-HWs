package midterm.observer.propertychange;

public class NumberPublisherDemo {

    public static void main(String[] args){

        NumberPublisher publisher = new NumberPublisher();

        publisher.addObserver(new DecimalView());
        publisher.addObserver(new BinaryView());
        publisher.addObserver(new HexaDecimalView());

        System.out.println("Sending numbers...");
        publisher.setNumberPublisher(1084583);
    }
}
