package minitwitter;

public class AdminControlPanel {
    
    protected static AdminControlPanel instance;
    
    private AdminControlPanel(){
        
    }
    
    public static AdminControlPanel getInstance(){
        
        if (instance == null) {
            instance = new AdminControlPanel();
        }
	
        return instance;
    }
    
    public void runProgram(){
        MiniTwitterGUI program = new MiniTwitterGUI();
        program.display();
    }
}
