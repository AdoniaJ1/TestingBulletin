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
		users = new ArrayList<String>();
		// Creating a new frame to store text field and
		// button
		f = new JFrame("panel");
		f.setSize(500, 300);
		JPanel chatPanel = new ChatPanel("Group1");
		chatPanel.setVisible(false);
		UsernamePanel userNamePanel = new UsernamePanel(users, chatPanel);
		f.add(userNamePanel);
		f.setVisible(true);
		f.add(chatPanel);
	}
}
