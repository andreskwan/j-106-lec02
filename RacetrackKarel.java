import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		runOneLength();
		runOneLength();
		runOneLength();
		runOneLength();
	}
	
	private void runOneLength() {
		move();
		move();
		move();
		turnLeft();
	}
}
