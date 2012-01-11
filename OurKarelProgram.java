import stanford.karel.*;

public class OurKarelProgram extends Karel {
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		putBeeper();
		move();
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void turnAround() {	
		turnRight();
		turnRight();
	}
}