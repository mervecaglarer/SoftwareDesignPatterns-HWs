package finalexam.state;

public class AtmMachine implements AtmMachineState {

	private static volatile AtmMachine instance;

    AtmMachineState hasCard;     
	AtmMachineState noCard;
	AtmMachineState hasCorrectPin;
	AtmMachineState atmOutOfMoney;
	
	AtmMachineState atmState;
	
	int cashInMachine = 25000;
	boolean correctPinEntered = false;
	
	private AtmMachine(int money){
		
		hasCard = new HasCardState(this);
		noCard = new HasNoCardState(this);
		hasCorrectPin = new HasPinState(this);
		atmOutOfMoney = new HasNoCashState(this);
		cashInMachine = money;
		atmState = noCard;
		
		if(cashInMachine < 0){
			atmState = atmOutOfMoney;
		}
	}

	public static AtmMachine getInstance(int money) {
		if (instance == null ) { // Single Checked
			synchronized (AtmMachine.class) {
				if (instance == null) { // Double checked
					instance = new AtmMachine(money);
				}
			}
		}
		return instance;
	}
	
	void setATMState(AtmMachineState newATMState){
		atmState = newATMState;	
	}
	
	public void setCashInMachine(int newCashInMachine){
		cashInMachine = newCashInMachine;	
	}
	
	public void insertCard(String cardNumber) {	
		atmState.insertCard(cardNumber);	
	}

	public void ejectCard() {	
		atmState.ejectCard();	
	}

	public void requestCash(int cash) {	
		atmState.requestCash(cash);	
	}

	public void enterPin(int pin){	
		atmState.enterPin(pin);	
	}
	
	public AtmMachineState getYesCardState() { return hasCard; }
	public AtmMachineState getNoCardState() { return noCard; }
	public AtmMachineState getHasPin() { return hasCorrectPin; }
	public AtmMachineState getNoCashState() { return atmOutOfMoney; }
}
