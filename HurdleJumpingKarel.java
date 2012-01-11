import stanford.karel.*;

public class HurdleJumpingKarel extends SuperKarel {
	public void run() {
		for (int i = 0; i < 8; i++) {
			jumpHurdle();
		}
	}
	
	/* Makes Karel jump over a single hurdle.
	 * 
	 * Precondition:  Karel is facing the hurdle.
	 * Postcondition: Karel is on the other side of the hurdle facing the same direction.
	 */
	private void jumpHurdle() {
		ascendHurdle();
		move();
		descendHurdle();
	}
	
	/* Makes Karel climb up to the top of a single hurdle.
	 * 
	 * Precondition:  Karel is against the hurdle, facing East.
	 * Postcondition: Karel is at the top of the hurdle facing East.
	 */
	private void ascendHurdle() {
		turnLeft();
		while (rightIsBlocked()) {
			move();
		}
		turnRight();
	}
	
	/* Makes Karel descend to the bottom of a single hurdle.
	 * 
	 * Precondition:  Karel is at the top of the hurdle, facing East.
	 * Postcondition: Karel is at the bottom of the hurdle, facing West.
	 */
	private void descendHurdle() {
		turnRight();
		while (rightIsBlocked()) {
			move();
		}
		turnLeft();
	}
}
