package minitwitter;

import View.MiniTwitterGUI;
import Interfaces.Windows;

public class AdminControlPanel {
    
    //Singleton instance
    protected static AdminControlPanel instance;
    
    //Make constructor private so new keyword won't work
    private AdminControlPanel(){
        
    }
    
    //Use this call to create object instance (Can only be created once)
    public static AdminControlPanel getInstance(){
        
        //Check if object instance has already been created
        if (instance == null) {
            instance = new AdminControlPanel();
        }
	
        return instance;
    }
    
    public void runFirstJFrame(){
        
        java.awt.EventQueue.invokeLater(() -> {
            Windows program = new MiniTwitterGUI();
            program.display();
        }); 
    }
}
