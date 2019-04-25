package strings_and_dialogs;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot

    	Robot  c3po = new Robot("mini");

        // 3. Put the robot's pen down
    	
    	c3po.penDown();


        // 6. Make the robot move as fast as possible

    	c3po.setSpeed(1000000000);

        // 5. Do everything below here 4 times
    	
for(int i= 0; i < 4; i++) {
	c3po.setRandomPenColor();
	c3po.setPenWidth(1000000000);

        //         2. Move your robot 200 pixels
	c3po.move(200);


        //         4. Turn the robot 90 degrees to the right (90 degrees)

	c3po.turn(90);
}
    }
}
