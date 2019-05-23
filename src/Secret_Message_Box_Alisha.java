import javax.swing.JOptionPane;

public class Secret_Message_Box_Alisha {

	public static void main(String[] args) {
		
		String secret = "himynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeffhimynamesjeff";
		String message = JOptionPane.showInputDialog("Psssst! Yes you! OVER HERE! I need you to do something for me! Can you make a secret message for me! Plez write yor message in the text-box ");
		String guess = JOptionPane.showInputDialog("Sup! Do you wanna know about a secret message written by one of your classmates? If you don't, I DON'T CARE! To see the message, you have to guess a RANDOM password. Good luck!");
		if (secret.equals(guess)) {
			
			JOptionPane.showMessageDialog(null, "Fine! You win! Here's the message:  " +message);
			
		}
		else {
			
			JOptionPane.showMessageDialog(null, "INTRUDER! INTRUDER!INTRUDER! INTRUDER!");
		}
		}
		
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	

