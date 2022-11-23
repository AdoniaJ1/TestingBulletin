import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class UsernamePanel extends JPanel{
    private static JLabel directionsLabel = new JLabel("Enter a unique username, then click the 'click me' button'");
    private static JButton userNameEnterButton = new JButton("Enter");
    private static JTextField userNameBox = new JTextField(25);
    private ArrayList<String> usernames;

    public void enterButtonClick(ActionEvent e, boolean userNameSet){
        String userName = userNameBox.getText();
        boolean hasUsername = this.usernames.contains(userName);
        if (hasUsername){
            System.out.println( "username already in use" );
        }else{
            this.usernames.add(userName);
            //this.setVisible(false);
            userNameSet = true;
        }
    }

    public UsernamePanel(ArrayList<String> usernames, boolean userNameSet) {
        setUsernames(usernames);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(directionsLabel);
        userNameEnterButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                enterButtonClick(e, userNameSet); //records the username on click of button
            }
        });
        this.add(userNameBox);
        this.add(userNameEnterButton);
    }

    public List<String> getUsernames() {
        return this.usernames;
    }

    public void setUsernames(ArrayList<String> usernames) {
        this.usernames = usernames;
    }

}
