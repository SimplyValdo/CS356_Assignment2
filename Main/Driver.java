package Main;

public class Driver {
    
    public static void main(String[] args){
        
        //Grab instance using Singleton & Run the main JFrame
        AdminControlPanel admin = AdminControlPanel.getInstance();
        admin.runFirstJFrame();
    }
}