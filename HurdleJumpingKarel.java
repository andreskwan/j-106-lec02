import stanford.karel.*;

public class HurdleJumpingKarel extends SuperKarel {
	public void run() {
		for (int i = 0; i < 8; i++) {
			jumpHurdle();
		}
	}
	
	private void jumpHurdle() {
		climbHurdle();
		move();
		descendHurdle();
	}
	
	private void climbHurdle() {
		turnLeft();
		while (rightIsBlocked()) {
			move();
		}
		turnRight();
	}
}
