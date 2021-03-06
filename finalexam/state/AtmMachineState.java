package finalexam.state;

public interface AtmMachineState {

    void insertCard(String cardNumber);
	
	void ejectCard();
	
	void enterPin(int pin);
	
	void requestCash(int cash);
}
