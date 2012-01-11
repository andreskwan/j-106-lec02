import stanford.karel.*;

public class RacetrackKarel extends Karel {
	public void run() {
		runOneStretch();
		runOneStretch();
		runOneStretch();
		runOneStretch();
	}
	
	/* Has Karel run one stretch of the race.
	 * 
	 * Precondition: Karel is at the beginning of one stretch of
	 *               the race.
	 * Postcondition: Karel is at the end of that stretch and has
	 *                turned to the left.
	 */
	private void runOneStretch() {
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnLeft();
	}
}
