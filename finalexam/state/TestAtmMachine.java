package finalexam.state;

public class TestAtmMachine{
    public static void main(String... args){
        //Create machine and set the current amount of money in the machine
        AtmMachine machine = AtmMachine.getInstance(25000);

        machine.insertCard("cardnumber");
        machine.enterPin(1234);
        machine.requestCash(3000);
        machine.ejectCard();

        machine.insertCard("cardnumber2");
        machine.enterPin(5678);
        machine.requestCash(5000);
        machine.requestCash(2000);
        machine.ejectCard();
    }
}
