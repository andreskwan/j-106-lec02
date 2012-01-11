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
	
	/* Causes Karel to turn to the right.
	 *  
	 * Precondition: None
	 * Postcondition: Karel has turned 90 degrees to the right.
	 */
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
}