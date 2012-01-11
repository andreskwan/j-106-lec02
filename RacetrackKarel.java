import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		for (int i = 0; i < 4; i++) {
			runOneStretch();
		}
	}
	
	private void runOneStretch() {
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnLeft();
	}
}
