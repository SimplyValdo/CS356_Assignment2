package minitwitter;

import javax.swing.JOptionPane;

public class PopUpMessage implements CompositePattern {

    @Override
    public void displayMessage(String message, int messageType) {
        JOptionPane.showMessageDialog(null, message, "Alert", messageType);
    }
    
}
