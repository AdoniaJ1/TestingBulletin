import javax.swing.JPanel;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class ChatPanel extends JPanel{

    private static JTextField subjectBox = new JTextField(25);
    private static JTextField contentBox = new JTextField(25);
    private JLabel groupName;

    public ChatPanel(String groupName) {
        setGroupName(groupName);
        this.add(subjectBox);
        this.add(contentBox);
    }

    public JLabel getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {

        this.groupName = new JLabel(groupName);
    }
}
