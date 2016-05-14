import stanford.karel.*;

/**
 * @author saasbook
 *
 */
public class OurKarelProgram extends SuperKarel {
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
