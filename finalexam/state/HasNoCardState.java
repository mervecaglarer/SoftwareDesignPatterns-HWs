package finalexam.state;

public class HasNoCardState  implements AtmMachineState {

    AtmMachine atmMachine;
	
	public HasNoCardState(AtmMachine newATMMachine){
		atmMachine = newATMMachine;
	}

	public void insertCard(String cardNumber) {
        System.out.println(cardNumber + " was inserted.");
        System.out.println("Please enter your PIN...");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	public void ejectCard() {
	}

	public void requestCash(int cash) {
		System.out.println("You have not inserted a CARD. Please insert your CARD!");	
	}

	public void enterPin(int pin) {	
		System.out.println("You have not inserted a CARD. Please insert your CARD!");	
	}
}
