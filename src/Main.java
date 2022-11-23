// Importing required classes
import java.awt.*;
import javax.swing.*;
import java.util.*;

// Class 1
// Helper class extending JFrame class
class Main extends JFrame {

	// JFrame
	static JFrame f;

	// Label to display text
	static JLabel l;

    static ArrayList<String> users;


	// Main class
	public static void main(String[] args)
	{
		boolean userNameSet = false;
		users = new ArrayList<String>();
		// Creating a new frame to store text field and
		// button
		f = new JFrame("panel");

		// Creating a panel to add buttons
		JPanel userNamePanel = new UsernamePanel(users, userNameSet);

		JPanel chatPanel = new JPanel();
		JButton button = new JButton("afjbaf");
		chatPanel.add(button);
		// Adding panel to frame
		f.add(userNamePanel);
		// Setting the size of frame
		f.setSize(300, 300);

		f.setVisible(true);

		while(!userNameSet){

		}
		userNamePanel.setVisible(false);
		f.add(chatPanel);
		chatPanel.setVisible(true);
	}
}
