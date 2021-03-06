package finalexam.state;

public class HasCardState implements AtmMachineState {

    AtmMachine atmMachine;
	
	public HasCardState(AtmMachine newATMMachine){
		atmMachine = newATMMachine;
	}

	public void insertCard(String cardNumber) {
		System.out.println("Only ONE CARD can be inserted at a time.");
	}

	public void ejectCard() {
		System.out.println("Your CARD is ejected.");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	public void requestCash(int cash) {
		System.out.println("You have not entered your PIN.");
	}

	public void enterPin( int pin) {
		if(pin == 1234 || pin == 5678){
			System.out.println("You entered the correct PIN.");
			atmMachine.correctPinEntered = true;
			atmMachine.setATMState(atmMachine.getHasPin());
		} else {
			System.out.println("You entered the wrong PIN.");
			atmMachine.correctPinEntered = false;
			System.out.println("Your CARD is ejected.");
			atmMachine.setATMState(atmMachine.getNoCardState());
		}	
	}	
}
