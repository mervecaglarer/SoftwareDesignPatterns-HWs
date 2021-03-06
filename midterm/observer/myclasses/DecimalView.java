package midterm.observer.myclasses;

public class DecimalView extends Observer{
	
	public DecimalView(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
	}
	
	public void update() {
        System.out.print("\nDecimal: " + subject.getState());
	}
}