/*
 * File: MeetKarel.java
 * ---------------------
 * This is a simple Karel program designed to show
 * some of the basic features of Karel the robot.
 */

import stanford.karel.*;

public class FirstKarelProgram extends Karel {
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnLeft();
		turnLeft();
		turnLeft();
		move();
		putBeeper();
		move();
	}
}

