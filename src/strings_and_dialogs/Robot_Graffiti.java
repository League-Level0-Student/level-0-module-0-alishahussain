package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class Robot_Graffiti {
	
public static void main(String[] args) {
	
	Robot chungus = new Robot();
			chungus.penDown();
			chungus.setRandomPenColor();
			chungus.setPenWidth(100);
			
			chungus.setSpeed(6000);
			chungus.turn(-15);
			chungus.move(300);
			chungus.turn(-150);
			chungus.move(300);
			chungus.turn(180);
			chungus.move(150);
			chungus.turn(70);
			chungus.move(100);
}
}
