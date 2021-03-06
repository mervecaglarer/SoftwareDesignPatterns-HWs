package finalexam.state;

public class HasNoCashState implements AtmMachineState{
	
    AtmMachine atmMachine;
	
	public HasNoCashState(AtmMachine newATMMachine){	
		atmMachine = newATMMachine;	
	}

	public void insertCard(String cardNumber) {
		System.out.println("ATM Machine does not have CASH.");
		System.out.println("Your CARD is ejected.");	
	}

	public void ejectCard() {
		System.out.println("ATM Machine does not have CASH.");
		System.out.println("There is no CARD to eject.");
	}

	public void requestCash(int cash) {	
		System.out.println("ATM Machine does not have CASH.");	
	}

	public void enterPin(int pin) {	
		System.out.println("ATM Machine does not have CASH.");	
	}
}
