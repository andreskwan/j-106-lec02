import stanford.karel.*;

public class OurKarelProgram extends Karel {
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		juggleCows();
		move();
		putBeeper();
		move();
	}
	
	private void juggleCows() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	private void turnAround() {	
		turnLeft();
		turnLeft();
	}
}