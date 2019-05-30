import javax.swing.JOptionPane;

public class The_Riddler {

	public static void main(String[] args) {

		int score = 0;
			String answer = "a coffin";
			String riddle = JOptionPane.showInputDialog("Hey there! I have a riddle for ya. See if you know the answer. \n"
			+ " Level 1: First Riddle!!! Here it is: Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it?");

		if (riddle.equals(answer)) {

			JOptionPane.showMessageDialog(null, "Great job! Are you ready for more?");
			score++;
			
		} else {

			JOptionPane.showMessageDialog(null, "NOPE!!! U suck at this game! The answer was: . . .    A STAMP!!!");
		}
		
		
			String answer2 = "a stamp";
			String riddle2 = JOptionPane.showInputDialog(
					"Level 2 : New Riddle!! Here it is: What can travel around the world while staying in a corner?");
		if (riddle2.equals(answer2)) {

			JOptionPane.showMessageDialog(null, "Great job! Are you ready for more?");
			score++;
			String answer3 = "a secret";
			String riddle3 = JOptionPane.showInputDialog(
					"Level 3 (Last Level!!!) : New Riddle!! Here it is: If you have me, you want to share me. If you share me, you haven't got me. What am I?");

			if (riddle3.equals(answer3)) {

				JOptionPane.showMessageDialog(null,
						"FABULOUS!!! You won this whole game!!! CONGRATS! YOU HAVE EARNED IT!!!");
				score++;
			}
		} else {

			JOptionPane.showMessageDialog(null, "NOPE!!! U suck at this game! The answer was: . . .    A SECRET!!!");
		}

	}
}
