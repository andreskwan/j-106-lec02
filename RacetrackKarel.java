import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		while (frontIsClear()) {
			runOneLength();	
		}
	}
	
	private void runOneLength() {
		while (frontIsClear()) {
			move();
		}
		turnLeft();
	}
}
