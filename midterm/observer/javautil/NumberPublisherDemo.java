package midterm.observer.javautil;

public class NumberPublisherDemo {

    public static void main(String[] args){

        NumberPublisher num = new NumberPublisher();

        num.addObserver(new HexaDecimalView());
        num.addObserver(new BinaryView());       
        num.addObserver(new DecimalView());
       
        
        System.out.println("Sending numbers...");
        num.setNumberPublisher(1084583);
    }
}
