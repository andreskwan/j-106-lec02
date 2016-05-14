import stanford.karel.*;

/**
 * @author saasbook
 *
 */
public class OurKarelProgram extends SuperKarel {
	public void run() {
//		move();
//		pickBeeper();
//		move();
//		turnLeft();
//		move();
//		turnRight();
//		move();
//		putBeeper();
//		move();
		moveToTheFrontPickingBeepers();
		turnLeft();
		move();
		turnRight();
		
		//here, karel is facing a wall 
		if(frontIsBlocked()){
			//rotate and try to advance 
			turnLeft();
		}
		//move around the wall
	}
	
	private void moveToTheFrontPickingBeepers() {
		while (frontIsClear()) {
			if (beepersPresent()) {
				pickBeeper();
			}
			move();
		}
	}
	
	/**
	 * This method allows Karel to climb a wall that is located at his right
	 * 
	 * <dt><b>Precondition:</b><dd> frontIsBlocked() returns true
	 * 
	 * 
	 */
	private void climbWallAtTheRightAndTurnRight() {
		turnLeft();
		move();
		//is there a wall at the east/right? 
		
	}
}
