
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {	
		WordsList WL = new WordsList();
		GuessWords W;
		int count;	
		String name = JOptionPane.showInputDialog(null, "Hello welcome to guess game\n Enter your name \n(Least more than one charters)","Guessing Game",JOptionPane.CLOSED_OPTION);
		if (name.length() == 0 || name.length() == 1) {System.exit(0);}
		//main loop
		do {
			W = new GuessWords(WL.getWrod());							
			String tryInput;
			count = 0;
			//loop for each try
			while(!W.isFounded()) {
				count++;
				tryInput = JOptionPane.showInputDialog(null,W.getStatus()+"\n"+W.GetLeftChar()+"\nPlease type a charters in range:\n[a-z,A-Z]","Guessing Game",JOptionPane.CLOSED_OPTION);
				if (tryInput == null) {System.exit(0);}
				if (tryInput.length() ==1) {W.SetChar(tryInput.charAt(0));}
				else {
					JOptionPane.showMessageDialog(null, "You need to type only one charter","Incorrect Input",JOptionPane.ERROR_MESSAGE);
				}
			}

		}while(JOptionPane.showConfirmDialog(null, "Congratulation "+ name + " !!\nYou finish the game after: "+ count +" attempts.\nWould you like to have another game?","End of guessing game: "+ W.getleftWrod(),JOptionPane.YES_NO_OPTION) == 0);
	}
}
