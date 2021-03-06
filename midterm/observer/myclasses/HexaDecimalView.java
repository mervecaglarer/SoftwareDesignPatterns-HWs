package midterm.observer.myclasses;

public class HexaDecimalView extends Observer {

	public HexaDecimalView(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
	}
	
	public void update() {
        System.out.print("\nHexadecimal: " + Integer.toHexString(subject.getState()));
	}
}