import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		runOneLength();
		runOneLength();
		runOneLength();
		runOneLength();
	}
	
	private void runOneLength() {
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnLeft();
	}
}
