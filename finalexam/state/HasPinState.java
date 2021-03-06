package finalexam.state;

public class HasPinState implements AtmMachineState{

    AtmMachine atmMachine;
	
	public HasPinState(AtmMachine newATMMachine){	
		atmMachine = newATMMachine;	
	}

	public void insertCard(String cardNumber) {	
		System.out.println("You already inserted a CARD.");	
	}

	public void ejectCard() {	
		System.out.println("Your CARD is ejected.");
		atmMachine.setATMState(atmMachine.getNoCardState());	
	}

	public void requestCash(int cash) {
		
		if(cash > atmMachine.cashInMachine){
			System.out.println("You do not have that much CASH available.");
			System.out.println("Your CARD is ejected.");
			atmMachine.setATMState(atmMachine.getNoCardState());
			
		} else {
			System.out.println(cash + " is provided by the ATM Machine.");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);
		} 
	}

	public void enterPin(int pin) {
		System.out.println("You already entered a PIN.");	
	}
}
