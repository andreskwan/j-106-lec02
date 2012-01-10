import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		runOneStretch();
		runOneStretch();
		runOneStretch();
		runOneStretch();
	}

	private void runOneStretch() {
		move();
		move();
		move();
		move();
		turnLeft();
	}
}
