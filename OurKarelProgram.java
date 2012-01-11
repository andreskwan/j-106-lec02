import stanford.karel.*;

public class OurKarelProgram extends Karel {
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
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
}