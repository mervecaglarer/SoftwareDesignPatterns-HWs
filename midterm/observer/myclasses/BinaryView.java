package midterm.observer.myclasses;


public class BinaryView extends Observer{

	public BinaryView(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
	}
	
	public void update() {
        System.out.print("\nBinary: " + Integer.toBinaryString(subject.getState()));
	}
	
}