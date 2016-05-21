import javax.print.attribute.PrintServiceAttribute;

import stanford.karel.*;
/**
 * @author saasbook
 *
 */
public class Pothole extends SuperKarel{
	public void run() {
		while(frontIsClear()){
			checkAndFillPothole();
			move();
		}
		checkAndFillPothole();
	}
	private void checkAndFillPothole() {
		if(rightIsClear()){
			fillPothole();
		}				 
	}
	private void fillPothole() {		
		turnRight();
		move();
		if (noBeepersPresent()) {
			putBeeper();
		}
		turnAround();
		move();
		turnRight();
	}
}

