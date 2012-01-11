import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		runOneStretch();
		runOneStretch();
		runOneStretch();
		runOneStretch();
	}
	
	private void runOneStretch() {
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnLeft();
	}
}
